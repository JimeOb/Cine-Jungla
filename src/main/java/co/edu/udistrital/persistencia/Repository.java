package co.edu.udistrital.persistencia;

import jakarta.persistence.Query;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.hibernate.Session;

public class Repository<K> {

    private final Class<K> typeClass;

    public Repository(Class<K> typeClass) {
        this.typeClass = typeClass;
    }

    public Optional<K> findById(Integer id) {

        Session session = HibernateSession.openSession();
        Optional<K> optEntity = session.byId(typeClass).loadOptional(id);
        session.close();

        return optEntity;
    }

    public List<K> findAll() {

        Session session = HibernateSession.openSession();

        final List<K> resultList = session.createSelectionQuery("FROM " + typeClass.getSimpleName(), typeClass).getResultList();
        session.close();

        return resultList;
    }

    public List<K> findByCriteria(String criteria) {

        Session session = HibernateSession.openSession();
        Query result = session.createQuery("from " + typeClass.getSimpleName()
                + " where " + criteria, typeClass);

        return result.getResultList();
    }

    public void insert(K entity) {
        Session session = HibernateSession.openSession();
        performMutableAction(session, () -> {
            session.persist(entity);
            session.flush();
        });
    }

    public void update(K entity) {
        Session session = HibernateSession.openSession();
        performMutableAction(session, () -> session.merge(entity));
    }

    public void delete(int id) {
        Session session = HibernateSession.openSession();
        Optional<K> optEntity = findById(id);
        K entity = optEntity.orElseThrow(NoSuchElementException::new);
        performMutableAction(session, () -> session.remove(entity));               
    }

    public void deleteAll() {
        Session session = HibernateSession.openSession();
        performMutableAction(session, () -> {
            session.createMutationQuery("delete from " + typeClass.getSimpleName())
                    .executeUpdate();
        });
    }

    private void performMutableAction(Session session, Runnable action) {
        session.beginTransaction();
        action.run();
        session.getTransaction().commit();
        session.close();
    }

}
