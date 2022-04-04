package co.edu.udistrital.hibernate;

import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.clientes.Credentials;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

public class HibernateTest {

    private static SessionFactory sessionFactory;
    private Cliente cliente;

    @BeforeAll
    public static void setupAll() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .loadProperties("hibernate.properties")
                .build();

        Metadata metadata = new MetadataSources(registry)
                .addAnnotatedClass(Cliente.class)
                .buildMetadata();

        sessionFactory = metadata.buildSessionFactory();

    }

    @AfterAll
    public static void tearDownAll() {
        sessionFactory.close();
    }

    @BeforeEach
    public void setup() {
        cliente = new Cliente();

        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(cliente);
        session.flush();
        session.getTransaction().commit();
        session.close();
    }
    
    @AfterEach
    public void tearDown() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.createMutationQuery("DELETE FROM Cliente").executeUpdate();
        session.getTransaction().commit();
        session.close();
    }

    @Test
    public void hibernateShouldContainsAClient() {

        Session session = sessionFactory.openSession();
        List<Cliente> clientes = getClientesInDB(session);
        session.close();

        System.out.println(clientes.get(0));

        Assertions.assertEquals(1, clientes.size());
        Assertions.assertEquals(cliente, clientes.get(0));

    }

    @Test
    public void hibernateShouldDeleteAClient() {
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.remove(cliente);
        session.getTransaction().commit();

        final List<Cliente> clientes = getClientesInDB(session);
        session.close();

        Assertions.assertEquals(0, clientes.size());
    }

    @Test
    public void hibernateShouldUpdateAnOldRecord() {
        Session session = sessionFactory.openSession();

        cliente.setNombre("Prueba");        
        cliente.setCredentials(new Credentials("prueba@correo", ""));
        cliente.setPuntos(1);

        session.beginTransaction();
        session.merge(cliente);
        session.getTransaction().commit();

        final Cliente updatedClient = session.byId(Cliente.class).load(cliente.getId());
        
        Assertions.assertEquals(cliente.getEmail(), updatedClient.getEmail());
    }

    public List<Cliente> getClientesInDB(Session session) {
        return session.createQuery("FROM Cliente", Cliente.class).getResultList();
    }
}
