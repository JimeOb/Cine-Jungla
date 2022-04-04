package co.edu.udistrital.persistencia;

import co.edu.udistrital.cine.logica.clientes.Cliente;
import java.util.List;
import java.util.NoSuchElementException;
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
    public void repositoryShouldFindAnEntityById() {

        final Cliente client = generateTestCliente();
        Optional<Cliente> optClient = repoClientes.findById(1);

        Assertions.assertFalse(optClient.isPresent());
        insertTestClient(generateTestCliente());
        optClient = repoClientes.findById(1);

        Assertions.assertTrue(optClient.isPresent());
    }

    @Test
    public void repositoryShouldReturnAnEmptyOptionalForUnexistingEntity() {
        int id = 10;
        Optional<Cliente> optClient = repoClientes.findById(id);
        Assertions.assertTrue(optClient.isEmpty());
    }

    @Test
    public void repositoryShouldObtainAllEntities() {

        for (int i = 0; i < 5; i++) {
            insertTestClient(generateTestCliente());
        }

        final List<Cliente> clients = repoClientes.findAll();

        Assertions.assertEquals(5, clients.size());
    }

    @Test
    public void repositoryShouldFilterResultsByCriteria() {

        Cliente client = generateTestCliente();
        insertTestClient(client);

        List<Cliente> clients = repoClientes.findByCriteria(String.format("e.email = '%s'", "anotheremail@mail"));

        Assertions.assertEquals(0, clients.size());

        clients = repoClientes.findByCriteria(String.format("e.email = '%s'", client.getEmail()));

        Assertions.assertEquals(1, clients.size());
    }

    @Test
    public void repositoryShouldInsertANewEntity() {

        insertTestClient(generateTestCliente());

        final List<Cliente> clients = repoClientes.findAll();

        Assertions.assertEquals(1, clients.size());
    }

    @Test
    public void repositoryShouldUpdateAEntity() {

        Cliente client = generateTestCliente();
        insertTestClient(client);

        client.setEmail("Nuevoemail@g.com");

        repoClientes.update(client);
        Optional<Cliente> updatedClient = repoClientes.findById(client.getId());

        Assertions.assertEquals(client.getEmail(), updatedClient.get().getEmail());
    }

    @Test
    public void repositoryShouldDeleteAEntityById() {

        Cliente client = generateTestCliente();
        insertTestClient(client);
        System.out.println(client.getId());

        repoClientes.delete(client.getId());

        List<Cliente> clients = repoClientes.findAll();
        Assertions.assertEquals(0, clients.size());
    }

    @Test
    public void repositoryShouldThrowsAnExceptionWhenTryingToDeleteAnUnexistingEntity() {
        int id = 99;
        Assertions.assertThrows(NoSuchElementException.class, () -> repoClientes.delete(id));
    }

    @Test
    public void repositoryShouldDeleteAllEntities() {

        for (int i = 0; i < 5; i++) {
            insertTestClient(generateTestCliente());
        }

        repoClientes.deleteAll();

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
