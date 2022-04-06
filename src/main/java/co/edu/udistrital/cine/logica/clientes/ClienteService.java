package co.edu.udistrital.cine.logica.clientes;

import co.edu.udistrital.persistencia.Repository;
import java.util.List;

public class ClienteService {

    private Repository<Cliente> repository;

    public ClienteService(Repository<Cliente> repository) {
        this.repository = repository;
    }

    public void registrarCliente(Cliente cliente) {

        if (existEmail(cliente.getEmail())) {
            throw new RegisterException("El email ingresado ya se encuentra registrado.");
        }
        cliente.setRole(Role.Cliente);
        repository.insert(cliente);
    }

    private boolean existEmail(String email) {

        List<Cliente> clientsWithThatEmail = repository.findByCriteria(String.format("credentials.email = '%s'", email));

        return !clientsWithThatEmail.isEmpty();
    }

}
