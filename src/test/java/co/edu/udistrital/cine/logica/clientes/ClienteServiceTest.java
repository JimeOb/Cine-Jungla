package co.edu.udistrital.cine.logica.clientes;

import co.edu.udistrital.persistencia.Repository;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import static org.mockito.Mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ClienteServiceTest {

    @Mock private Repository<Cliente> repoClientes;
    private ClienteService service;
    private Cliente cliente;

    @BeforeEach
    public void setup() {
        service = new ClienteService(repoClientes);
        cliente = new Cliente();
        cliente.setCredentials(new Credentials("mail@mail", "pass"));
    }

    @Test
    public void clientServiceShouldRegisterANewClient() {
        
        Cliente newClient = new Cliente(3, "teresa", 80);
        newClient.setCredentials(new Credentials("myemail@mail", "pass"));
        
        service.registrarCliente(newClient);

        ArgumentCaptor<Cliente> argument = ArgumentCaptor.forClass(Cliente.class);
        verify(repoClientes).insert(argument.capture());
        Assertions.assertEquals(newClient, argument.getValue());
    }

    @Test
    public void clienteServiceShouldRejectRegistrationByDuplicatedEmail() {

        Cliente newClient = new Cliente(2, "pedro", 20);
        newClient.setCredentials(new Credentials("mail@mail", "pass"));

        when(repoClientes.findByCriteria(String.format("credentials.email = '%s'", newClient.getEmail())))
                .thenReturn(List.of(cliente));

        Assertions.assertThrows(RegisterException.class, () -> service.registrarCliente(newClient));
        verify(repoClientes, never()).insert(any());
    }

}
