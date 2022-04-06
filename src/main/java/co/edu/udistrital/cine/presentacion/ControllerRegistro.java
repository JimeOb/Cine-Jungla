package co.edu.udistrital.cine.presentacion;

import co.edu.udistrital.cine.handlers.ClientHandler;
import co.edu.udistrital.cine.handlers.Response;
import co.edu.udistrital.cine.logica.clientes.ClientBuilder;
import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.clientes.Credentials;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class ControllerRegistro implements ActionListener {

    private ClientHandler handler;
    private PnRegistro pnRegistro;
    private ClientBuilder builder;
    private Response response;

    public ControllerRegistro(ClientHandler handler, ClientBuilder builder) {
        this.handler = handler;
        this.builder = builder;
    }

    public void registerPnRegistro(PnRegistro pnRegistro) {
        this.pnRegistro = pnRegistro;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        response = handler.process("registrarse", obtainClient());
        showResponse();
    }

    private void showResponse() {

        final String mensaje = response.getMensaje();

        if (response.isError()) {
            JOptionPane.showMessageDialog(pnRegistro, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            pnRegistro.getJtxEmail().setText("");
            pnRegistro.getJtxNombre().setText("");
            pnRegistro.getJtxContrasena().setText("");

            JOptionPane.showMessageDialog(pnRegistro, mensaje);
            pnRegistro
                    .getVista()
                    .changePanel(pnRegistro.getVista().getPnInfo());
            
        }
    }

    private Cliente obtainClient() {
        Cliente cliente = builder
                .addNombre(pnRegistro.getJtxNombre().getText())
                .addCredentials(new Credentials(
                        pnRegistro.getJtxEmail().getText(),
                        new String(pnRegistro.getJtxContrasena().getPassword())
                ))
                .addPuntos(0)
                .build();
        return cliente;
    }

}
