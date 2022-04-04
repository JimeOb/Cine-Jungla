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

    @BeforeEach
    public void setup() {
        service = new ClienteService(repoClientes);
    }

    @Test
    public void clientServiceShouldRegisterANewClient() {

        Cliente cliente = new Cliente(3, "teresa", "teresa@gmail", "pass", 80);

        service.registrarCliente(cliente);

        ArgumentCaptor<Cliente> captor = ArgumentCaptor.forClass(Cliente.class);
        verify(repoClientes).insert(captor.capture());
        Assertions.assertEquals(cliente, captor.getValue());
    }

    @Test
    public void clienteServiceShouldRejectRegistrationByDuplicatedEmail() {

        Cliente cliente = new Cliente(2, "pedro", "arnol@gmail", "pass", 20);

        when(repoClientes.findByCriteria(anyString())).thenReturn(List.of(
                new Cliente(1, "arnol", "arnol@gmail", "pass123", 10)
        ));

        Assertions.assertThrows(RegisterException.class, () -> service.registrarCliente(cliente));
        verify(repoClientes, never()).insert(any());
    }

}
