package co.edu.udistrital.persistencia;

import java.util.List;
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

    public void insert(K entity) {
        Session session = HibernateSession.openSession();
        performMutableAction(session, () -> {
            session.merge(entity);
            session.flush();
        });
    }

    public void update(K entity) {
        Session session = HibernateSession.openSession();
        performMutableAction(session, () -> session.merge(entity));
    }

    public void delete(int id) {
        Session session = HibernateSession.openSession();
        performMutableAction(session, () -> session.remove(id));
    }
    
    public void deleteAll() {
        Session session = HibernateSession.openSession();
        session.createMutationQuery("DELETE FROM " + typeClass.getSimpleName());
        session.close();
    }

    private void performMutableAction(Session session, Runnable action) {
        session.beginTransaction();
        action.run();
        session.getTransaction().commit();
        session.close();
    }

}
