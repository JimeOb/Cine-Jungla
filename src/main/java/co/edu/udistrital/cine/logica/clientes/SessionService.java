package co.edu.udistrital.cine.logica.clientes;

import co.edu.udistrital.persistencia.Repository;
import java.util.List;

public class SessionService {

    private Repository<Cliente> repo;
            
    public SessionService(Repository<Cliente> repo) {
        this.repo = repo;
    }
    
    public boolean validateCredentials(Credentials credentials) {
        
        List<Cliente> user = repo.findByCriteria(String.format("e.email = '%s' AND e.password = '%s'", 
                credentials.getEmail(), 
                credentials.getPassword())
        );
        
        return user.size() > 0;        
    }
    
}
