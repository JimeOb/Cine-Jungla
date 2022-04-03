package co.edu.udistrital.persistencia;

import co.edu.udistrital.clientes.Cliente;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateSession {

    private static SessionFactory sessionFactory;
    
    static {
        bootstrap();
    }
    
    public static Session openSession() {                
        return null;
    }
    
    private static void bootstrap() {
        try {
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .loadProperties("hibernate.properties")
                .build();
        
        Metadata metadata = new MetadataSources(registry)
                .addAnnotatedClass(Cliente.class)
                .buildMetadata();
        
        sessionFactory = metadata.buildSessionFactory();
        } catch(Exception e)        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        
    }
    
}
