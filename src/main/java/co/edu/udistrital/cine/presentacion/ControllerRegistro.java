package co.edu.udistrital.cine.presentacion;

import co.edu.udistrital.cine.handlers.ClientHandler;
import co.edu.udistrital.cine.logica.clientes.ClientBuilder;
import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.clientes.Credentials;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerRegistro implements ActionListener {
    
    private ClientHandler handler;
    private PnRegistro pnRegistro;
    private ClientBuilder builder;

    public ControllerRegistro(ClientHandler handler, ClientBuilder builder) {
        this.handler = handler;                
        this.builder = builder;
    }
    
    public void registerPnRegistro(PnRegistro pnRegistro) {
        this.pnRegistro = pnRegistro;
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        handler.process("registrarse", obtainClient());
    }
    
    private Cliente obtainClient() {        
        Cliente cliente = builder
                .addNombre(pnRegistro.getJtxNombre().getText())
                .addCredentials(new Credentials(
                        pnRegistro.getJtxEmail().getText(),
                        new String(pnRegistro.getJtxContrasena().getPassword())
                ))
                .build();
        return cliente;
    }
    
}
