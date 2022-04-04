package co.edu.udistrital.cine.logica.clientes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClientBuilderTest {

    private ClientBuilder builder;

    @BeforeEach
    public void setup() {
        builder = new ClientBuilder();
    }
    
    @Test
    public void builderShouldAddName() {
        final String expected = "Pedro";
        final Cliente client = builder.addNombre(expected).build();
        
        Assertions.assertEquals(expected, client.getNombre());
    }

    @Test
    public void builderShouldAddCredentials() {
        final Credentials credentials = new Credentials("mail", "pass");
        final Cliente client = builder.addCredentials(credentials)
                .build();
        
        Assertions.assertEquals(credentials, client.getCredentials());
    }

    @Test
    public void builderShouldAddPuntos() {
        final int puntos = 10;
        final Cliente client = builder.addPuntos(puntos).build();
        
        Assertions.assertEquals(puntos, client.getPuntos());
    }

    @Test
    public void builderShouldAddID() {
        
        final int id = 1;        
        final Cliente client = builder.addId(id).build();
        
        Assertions.assertEquals(id, client.getId());
    }

    @Test
    public void builderShouldBuildACompleteClient() {
        final String nombre = "Pedro";
        final int id = 1;
        final Credentials credentials = new Credentials("mail", "pass");
        final int puntos = 15;
        
        final Cliente client = builder
                .addId(id)
                .addNombre(nombre)
                .addCredentials(credentials)
                .addPuntos(puntos)
                .build();
        
        Assertions.assertEquals(nombre, client.getNombre());
        Assertions.assertEquals(id, client.getId());
        Assertions.assertEquals(puntos, client.getPuntos());
        Assertions.assertEquals(credentials, client.getCredentials());
    }
    
    @Test
    public void builderShouldClearDataAfterBuildAClient() {
        final Cliente client1 = builder.addNombre("pedro").build();
        final Cliente client2 = builder.addPuntos(0).build();
        
        Assertions.assertNotEquals(client1.getNombre(), client2.getNombre());
    }
    
}
