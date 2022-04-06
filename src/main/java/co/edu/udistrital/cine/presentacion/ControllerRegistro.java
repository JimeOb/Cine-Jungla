package co.edu.udistrital.cine.presentacion;

import co.edu.udistrital.cine.handlers.ClientHandler;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerRegistro implements ActionListener {
    
    private ClientHandler handler;
    private PnRegistro pnRegistro;

    public ControllerRegistro(ClientHandler handler, PnRegistro pnRegistro) {
        this.handler = handler;
        this.pnRegistro = pnRegistro;
    }
   
    @Override
    public void actionPerformed(ActionEvent e) {
        handler.process("registrarse", null);
    }
    
}
