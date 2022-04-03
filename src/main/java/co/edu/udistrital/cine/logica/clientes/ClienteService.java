package co.edu.udistrital.cine.logica.clientes;

import co.edu.udistrital.persistencia.Repository;

public class ClienteService {
    
    private Repository<Cliente> repository; 

    public ClienteService(Repository<Cliente> repository) {
        this.repository = repository;
    }
    
    public void registrarse(Cliente cliente) {
        repository.insert(cliente);
    }
    
}
