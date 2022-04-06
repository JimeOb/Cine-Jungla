package co.edu.udistrital.cine.session;

import co.edu.udistrital.cine.logica.clientes.Credentials;
import co.edu.udistrital.cine.logica.clientes.User;
import co.edu.udistrital.persistencia.Repository;
import java.util.List;
import java.util.Optional;
import lombok.Data;

@Data
public class SessionService {

    private Repository repository;
    private final AppSession appSession;
            
    public SessionService(Repository repository, AppSession appSession) {
        this.repository = repository;
        this.appSession = appSession;
    }
    
    public void login(User user) {
        if(!validateCredentials(user.getCredentials()))
            throw new IncorrectCredentialsException("El usuario y contraseña no coinciden.");
     
        appSession.setLoggedUser(Optional.of(user));
    }
    
    public void logout() {
        appSession.setLoggedUser(Optional.ofNullable(null));
    }
    
    public boolean aa() {
        return appSession.isActive();
    }
    
    private boolean validateCredentials(Credentials credentials) {
        
        List<User> user = repository.findByCriteria(String.format("credentials.email = '%s' AND credentials.password = '%s'", 
                credentials.getEmail(), 
                credentials.getPassword())
        );
        
        return !user.isEmpty();        
    }
    
}
