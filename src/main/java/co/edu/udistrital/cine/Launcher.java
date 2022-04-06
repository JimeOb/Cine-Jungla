package co.edu.udistrital.cine;

import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.clientes.ClienteService;
import co.edu.udistrital.cine.handlers.ClientHandler;
import co.edu.udistrital.cine.handlers.SessionHandler;
import co.edu.udistrital.cine.logica.clientes.ClientBuilder;
import co.edu.udistrital.cine.presentacion.ControllerRegistro;
import co.edu.udistrital.cine.presentacion.PnCliente;
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
        app.run();
    }
    
    public void run() {
        HibernateSession.initialize();
        vista = new Vista();        
        initializeComponents();
    }
    
    private void initializeComponents() {
        //Sesion
        AppSession appSession = new AppSession(Clock.systemDefaultZone());        
        
        //Repositories
        Repository<Cliente> repoClientes = new Repository(Cliente.class);
        
        //builders
        ClientBuilder clientBuilder = new ClientBuilder();
        
        //Services
        ClienteService clienteService = new ClienteService(repoClientes);
        SessionService sessionService = new SessionService(repoClientes, appSession);
        
        //Handlers
        ClientHandler clienteHandler = new ClientHandler(clienteService);
        SessionHandler sessionHandler = new SessionHandler(sessionService);
        
        //Controllers
        ControllerRegistro registroController = new ControllerRegistro(clienteHandler, clientBuilder);
        
        //Paneles
        PnRegistro pnRegistro = new PnRegistro(vista, registroController);     
        registroController.registerPnRegistro(pnRegistro);
        
        PnCliente pnCliente = new PnCliente();
        
        vista.setPnRegistro(pnRegistro);
        vista.setPnCliente(pnCliente);
        vista.setHandler(sessionHandler);
    }
}
