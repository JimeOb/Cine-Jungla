package co.edu.udistrital.cine;

import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.clientes.ClienteService;
import co.edu.udistrital.cine.handlers.ClientHandler;
import co.edu.udistrital.cine.handlers.SessionHandler;
import co.edu.udistrital.cine.presentacion.ControllerRegistro;
import co.edu.udistrital.cine.presentacion.PnRegistro;
import co.edu.udistrital.cine.presentacion.Vista;
import co.edu.udistrital.cine.session.AppSession;
import co.edu.udistrital.cine.session.SessionService;
import co.edu.udistrital.persistencia.HibernateSession;
import co.edu.udistrital.persistencia.Repository;
import java.time.Clock;

public class Launcher{
    
    private Vista vista;
    
    public static void main(String[] args){
        final Launcher app = new Launcher();
        app.initialize();
    }
    
    public void initialize() {
        HibernateSession.initialize();
        vista = new Vista();
    }
    
    private void initializeRepositories() {
        Repository<Cliente> repoClientes = new Repository(Cliente.class);
        ClienteService clienteService = new ClienteService(repoClientes);
        ClientHandler clienteHandler = new ClientHandler(clienteService);
        
        AppSession appSession = new AppSession(Clock.systemDefaultZone());
        SessionService sessionService = new SessionService(repoClientes, appSession);
        SessionHandler sessionHandler = new SessionHandler(sessionService);
        
        PnRegistro pnRegistro = new PnRegistro(vista);
        ControllerRegistro registroController = new ControllerRegistro(clienteHandler, pnRegistro);
    }
}
