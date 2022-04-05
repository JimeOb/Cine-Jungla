package co.edu.udistrital.cine.session;

import co.edu.udistrital.cine.empleado.Cargo;
import co.edu.udistrital.cine.empleado.Empleado;
import co.edu.udistrital.cine.logica.clientes.ClientBuilder;
import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.clientes.Credentials;
import co.edu.udistrital.cine.logica.clientes.User;
import co.edu.udistrital.persistencia.Repository;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class SessionServiceTest {

    @Mock
    private Repository<Cliente> repoClientes;        
    
    @Mock
    private Repository<Empleado> repoEmpleados;
    
    @Mock
    private AppSession appSession;
    
    private SessionService service;
    
    private User user;    

    @BeforeEach
    public void setup() {
        
        user = new ClientBuilder()
                .addCredentials(new Credentials("",""))
                .build();
        
        service = new SessionService(repoClientes, appSession);
    }

    @Test
    public void loginWithIncorrectCredentialsShouldThrowsAnException() {

        IncorrectCredentialsException exception = Assertions.assertThrows(
                IncorrectCredentialsException.class, 
                () -> service.login(user)
        );
        
        Assertions.assertEquals("El usuario y contraseña no coinciden.", exception.getMessage());
    }

    @Test
    public void serviceShouldLoginWithCorrectCredentials() {

        final Credentials credentials = new Credentials("mail@registered", "pass");        
        user.setCredentials(credentials);
        when(repoClientes.findByCriteria(anyString()))
                .thenReturn(List.of(
                        new ClientBuilder().build()));

        service.login(user);
        
        ArgumentCaptor<Optional<User>> argument = ArgumentCaptor.forClass(Optional.class);
        verify(appSession).setLoggedUser(argument.capture());        
        Assertions.assertEquals(user, argument.getValue().get());        
    }

    @Test
    public void sessionShouldRemoveTheLoggedUser() {
        
        service.logout();
        
        verify(appSession).setLoggedUser(Optional.ofNullable(null));
        
    }
    
    @Test
    public void empleadoShouldCanLoginInTheApp() {
                
        service.setRepository(repoEmpleados);
        
        when(repoEmpleados
                .findByCriteria(anyString()))
                .thenReturn(List.of(new Empleado()));
        
        service.login(user);
        
        ArgumentCaptor<Optional<User>> argument = ArgumentCaptor.forClass(Optional.class);
        verify(appSession).setLoggedUser(argument.capture());
        Assertions.assertEquals(user, argument.getValue().get());
    }
}
