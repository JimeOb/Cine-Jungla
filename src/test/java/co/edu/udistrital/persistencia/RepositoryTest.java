package co.edu.udistrital.persistencia;

import co.edu.udistrital.cine.logica.clientes.Cliente;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RepositoryTest {

    private Repository<Cliente> repoClientes;

    public RepositoryTest() {
        this.repoClientes = new Repository<>(Cliente.class);
    }
    
    @BeforeEach
    public void setup() {
        repoClientes.deleteAll();
    }
    
    @AfterAll
    public static void teardownAll() {
        HibernateSession.shutdown();
    }
    
    @Test
    public void testFindById() {
        
        final Cliente client = generateTestCliente();
        Optional<Cliente> optClient = repoClientes.findById(1);

        Assertions.assertFalse(optClient.isPresent());        
        insertTestClient(generateTestCliente());
        optClient = repoClientes.findById(1);        
        
        Assertions.assertTrue(optClient.isPresent());        
    }

    @Test
    public void testFindAll() {
        
        for(int i = 0; i < 5; i++)
            insertTestClient(generateTestCliente());
        
        final List<Cliente> clients = repoClientes.findAll();
        
        Assertions.assertEquals(5, clients.size());
    }

    @Test
    public void testInsert() {
        
        insertTestClient(generateTestCliente());        
        
        final List<Cliente> clients = repoClientes.findAll();
        
        Assertions.assertEquals(1, clients.size());        
    }

    @Test
    public void testUpdate() {
        
        Cliente client = generateTestCliente();        
        insertTestClient(client);
        
        client.setEmail("Nuevoemail@g.com"); 
        client.setId(1);
        repoClientes.update(client);        
        Optional<Cliente> updatedClient = repoClientes.findById(1);
        
        Assertions.assertEquals(client.getEmail(), updatedClient.get().getEmail());        
    }

    @Test
    public void testDelete() {
        
        insertTestClient(generateTestCliente());        
        int id = 1;
        repoClientes.delete(id);
        
        List<Cliente> clients = repoClientes.findAll();
        Assertions.assertEquals(0, clients.size());
    }
    
    private Cliente generateTestCliente() {
        Cliente cliente = new Cliente();
                
        cliente.setNombre("cliente prueba");
        cliente.setEmail("emailprueba@prueba.com");
        cliente.setPassword("pass");
        cliente.setPuntos(0);
        
        return cliente;
    }

    private void insertTestClient(Cliente cliente) {
        repoClientes.insert(cliente);
    }
}
