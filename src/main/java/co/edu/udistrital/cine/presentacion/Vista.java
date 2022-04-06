package co.edu.udistrital.cine.presentacion;

import co.edu.udistrital.cine.handlers.RequestHandler;
import co.edu.udistrital.cine.handlers.Response;
import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.clientes.Credentials;
import co.edu.udistrital.cine.logica.clientes.User;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vista extends javax.swing.JFrame {

    private PnRegistro pnRegistro;
    private RequestHandler handler;
    private PnCliente pnCliente;
    
    public Vista() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("Cine Jungla Services");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800, 800);
        setVisible(true);        
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnInfo = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jtxUsuario1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxContrasena2 = new javax.swing.JPasswordField();
        btnIniciar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        getContentPane().setLayout(new java.awt.FlowLayout());

        pnInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnInfo.setPreferredSize(new java.awt.Dimension(800, 600));
        pnInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 18, 18));
        jLabel5.setText("Usuario :");
        pnInfo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 210, 50));

        jtxUsuario1.setBackground(new java.awt.Color(204, 204, 204));
        pnInfo.add(jtxUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, 290, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setToolTipText("");
        pnInfo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 30, 530, 200));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(220, 27, 27));
        jLabel12.setText("Contraseña:");
        pnInfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 210, 50));

        jtxContrasena2.setBackground(new java.awt.Color(204, 204, 204));
        pnInfo.add(jtxContrasena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 290, 40));

        btnIniciar.setBackground(new java.awt.Color(238, 28, 28));
        btnIniciar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnIniciar.setText("Iniciar Sesión");
<<<<<<< HEAD
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });
        pnInfo.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 180, 40));
=======
        pnInfo.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 470, 180, 40));
>>>>>>> 3b5e6d74638bfa82644e11245fb6c4dfbc46057c

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButton1.setText("Registrar Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnInfo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 470, 180, 40));

        getContentPane().add(pnInfo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        changePanel(pnRegistro);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        Response response = handler.process("iniciarSesion", obtainUser());
        handleResponse(response);
    }//GEN-LAST:event_btnIniciarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIniciar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField jtxContrasena2;
    private javax.swing.JTextField jtxUsuario1;
    private javax.swing.JPanel pnInfo;
    // End of variables declaration//GEN-END:variables

    public void changePanel (JPanel pnl) {
        getContentPane().removeAll();                 
        getContentPane().add(pnl);
        getContentPane().revalidate();
        getContentPane().repaint();
    }   
    
    public User obtainUser() {
        User cliente = new Cliente();
        cliente.setCredentials(new Credentials(
                jtxUsuario1.getText(),
                new String(jtxContrasena2.getPassword()))
        );
        
        return cliente;
    }
    
    private void handleResponse(Response response) {
        
        if(response.isError()) {
            JOptionPane.showMessageDialog(pnInfo, response.getMensaje(), "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            changePanel(pnCliente);
        }
        
    }
}
