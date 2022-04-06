package co.edu.udistrital.cine.handlers;

import co.edu.udistrital.cine.logica.clientes.User;
import co.edu.udistrital.cine.session.AppSession;
import co.edu.udistrital.cine.session.IncorrectCredentialsException;
import co.edu.udistrital.cine.session.SessionService;

public class SessionHandler implements RequestHandler {

    private final SessionService sessionService;
    private RequestHandler next;

    public SessionHandler(SessionService service) {        
        this.sessionService = service;
    }

    @Override
    public void setNext(RequestHandler next) {
        this.next = next;
    }

    @Override
    public Response process(String request, Object requestData) {

        switch(request) {
            case "iniciarSesion": 
                return handleLogin(requestData);                
            case "cerrarSesion":
                sessionService.logout();
            case "validate": 
                validateSession(request, requestData);
                break;            
        }
        
        return new Response();        
    }
    
    private Response handleLogin(Object requestData) {
        Response response = new Response();
        
        try {
            sessionService.login((User) requestData);            
        } catch(IncorrectCredentialsException e) {
            response.setMensaje(e.getMessage());
            response.setError(true);
        }
        
        return response;
    }
    
    private void validateSession(String request, Object requestData) {
        final AppSession appSession = sessionService.getAppSession();
        
        if (appSession.isActive()) {
            appSession.extendSession();
            next.process(request, requestData);
        }
    }
}
