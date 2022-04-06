package co.edu.udistrital.cine.presentacion;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PnRegistro extends javax.swing.JPanel {

    private ControllerRegistro control;
    private Vista vista;
    
    public PnRegistro(Vista vista, ControllerRegistro controller) {
        initComponents();
        this.vista = vista;
        this.control = controller;        
        capturarEventos();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jtxNombre = new javax.swing.JTextField();
        jtxContrasena = new javax.swing.JPasswordField();
        btnRegistrar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(233, 18, 18));
        jLabel3.setText("Usuario :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 210, 50));

        jtxNombre.setBackground(new java.awt.Color(204, 204, 204));
        add(jtxNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 290, 40));

        jtxContrasena.setBackground(new java.awt.Color(204, 204, 204));
        add(jtxContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 290, 40));

        btnRegistrar.setBackground(new java.awt.Color(238, 28, 28));
        btnRegistrar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnRegistrar.setText("Registrar usuario");
        add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 410, 180, 40));

        jLabel6.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(220, 27, 27));
        jLabel6.setText("Contraseña:");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 210, 50));

        jLabel4.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(233, 18, 18));
        jLabel4.setText("Email :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 210, 50));

        jtxEmail.setBackground(new java.awt.Color(204, 204, 204));
        add(jtxEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 290, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField jtxContrasena;
    private javax.swing.JTextField jtxEmail;
    private javax.swing.JTextField jtxNombre;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        btnRegistrar.addActionListener(control);
        
    }

}
