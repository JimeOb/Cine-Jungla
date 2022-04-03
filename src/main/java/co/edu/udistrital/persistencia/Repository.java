package co.edu.udistrital.persistencia;

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

    public void insert(K entity) {
        Session session = HibernateSession.openSession();
        performMutableAction(session, () -> session.persist(entity));
    }

    public void update(K entity) {
        Session session = HibernateSession.openSession();
        performMutableAction(session, () -> session.merge(entity));
    }

    public void delete(int id) {
        Session session = HibernateSession.openSession();
        performMutableAction(session, () -> session.remove(id));
    }

    private void performMutableAction(Session session, Runnable action) {
        session.beginTransaction();
        action.run();
        session.getTransaction().commit();
        session.close();
    }

}
