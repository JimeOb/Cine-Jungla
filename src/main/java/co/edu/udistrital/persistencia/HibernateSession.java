package co.edu.udistrital.persistencia;

import co.edu.udistrital.cine.empleado.Contrato;
import co.edu.udistrital.cine.empleado.Empleado;
import co.edu.udistrital.cine.multiplex.Multiplex;
import co.edu.udistrital.cine.multiplex.Sala;
import co.edu.udistrital.cine.multiplex.Silla;
import co.edu.udistrital.cine.logica.clientes.BoletaPremio;
import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.peliculas.HorariosPelicula;
import co.edu.udistrital.cine.peliculas.Pelicula;
import co.edu.udistrital.cine.peliculas.Reservacion;
import co.edu.udistrital.cine.peliculas.ValoracionPelicula;
import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import co.edu.udistrital.cine.ventas.ProductoVenta;
import co.edu.udistrital.cine.ventas.ProductoVentaIdentity;
import co.edu.udistrital.cine.ventas.Venta;
import co.edu.udistrital.cine.logica.confiteria.productos.ProductosMultiplex;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateSession {

    private static SessionFactory sessionFactory;

    public static Session openSession() {
        return sessionFactory.openSession();
    }

    public static void initialize() {
        bootstrapHibernate();
    }

    private static void bootstrapHibernate() {
        try {
            configureBasics();
        } catch (Exception e) {
            logError(e);
        }
    }

    private static void configureBasics() {
        StandardServiceRegistry registry = createStandardServiceRegistry();
        Metadata metadata = generateMetaData(registry);
        sessionFactory = metadata.buildSessionFactory();
    }

    private static StandardServiceRegistry createStandardServiceRegistry() {
        return new StandardServiceRegistryBuilder()
                .loadProperties("hibernate.properties")
                .build();
    }

    private static Metadata generateMetaData(ServiceRegistry registry) {
        return new MetadataSources(registry)
                .addAnnotatedClass(Cliente.class)
                .addAnnotatedClass(BoletaPremio.class)
                .addAnnotatedClass(Empleado.class)
                .addAnnotatedClass(Contrato.class)
                .addAnnotatedClass(Multiplex.class)
                .addAnnotatedClass(Sala.class)
                .addAnnotatedClass(Silla.class)
                .addAnnotatedClass(Reservacion.class)
                .addAnnotatedClass(HorariosPelicula.class)
                .addAnnotatedClass(Pelicula.class)
                .addAnnotatedClass(ValoracionPelicula.class)
                .addAnnotatedClass(Comida.class)
                .addAnnotatedClass(Venta.class)
                .addAnnotatedClass(ProductoVenta.class)
                .addAnnotatedClass(ProductoVentaIdentity.class)
                .addAnnotatedClass(ProductosMultiplex.class)
                .buildMetadata();
    }

    private static void logError(Exception e) {
        e.printStackTrace();
        System.out.println(e.getMessage());
    }
    
    public static void shutdown() {
        sessionFactory.close();
    }

}
