package co.edu.udistrital.cine.handlers;

import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.clientes.ClienteService;

public class ClientHandler implements RequestHandler {

    private final ClienteService service;
    private RequestHandler next;

    public ClientHandler(ClienteService service) {        
        this.service = service;
    }
    
    @Override
    public void setNext(RequestHandler next) {
        this.next = next;
    }

    @Override
    public void process(String request, Object requestData) {
        
        switch (request) {
            case "registrarse": 
                service.registrarCliente((Cliente) requestData);
                break; 
        }        
    }    
}
