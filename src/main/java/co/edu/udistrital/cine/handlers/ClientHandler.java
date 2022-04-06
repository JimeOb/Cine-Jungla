package co.edu.udistrital.cine.handlers;

import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.clientes.ClienteService;
import co.edu.udistrital.cine.logica.clientes.RegisterException;

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
    public Response process(String request, Object requestData) {
        
        switch (request) {
            case "registrarse": 
                return processRegister(requestData);
            default:
                return new Response();
        }        
        
    }    
    
    private Response processRegister(Object requestData) {
        
        final Response response = new Response();
        
        try {
            service.registrarCliente((Cliente) requestData);
            response.setMensaje("Te has registrado correctamente");            
            response.setError(false);            
        } catch(RegisterException e) {
            response.setMensaje(e.getMessage());
            response.setError(true);
        }
        
        return response;
    }
}
