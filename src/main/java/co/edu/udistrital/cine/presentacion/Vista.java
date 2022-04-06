package co.edu.udistrital.cine.presentacion;

import javax.swing.JPanel;
import lombok.Setter;

@Setter
public class Vista extends javax.swing.JFrame {

    private PnRegistro pnRegistro;
    
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
        getContentPane().setLayout(new java.awt.FlowLayout());

        pnInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 18, 18));
        jLabel5.setText("Usuario :");
        pnInfo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 210, 50));

        jtxUsuario1.setBackground(new java.awt.Color(204, 204, 204));
        pnInfo.add(jtxUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 290, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setToolTipText("");
        pnInfo.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 530, 200));

        jLabel12.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(220, 27, 27));
        jLabel12.setText("Contraseña:");
        pnInfo.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 210, 50));

        jtxContrasena2.setBackground(new java.awt.Color(204, 204, 204));
        pnInfo.add(jtxContrasena2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 360, 290, 40));

        btnIniciar.setBackground(new java.awt.Color(238, 28, 28));
        btnIniciar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnIniciar.setText("Iniciar Sesión");
        pnInfo.add(btnIniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 470, 180, 40));

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jButton1.setText("Registrar Usuario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        pnInfo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 180, 40));

        getContentPane().add(pnInfo);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        changePanel(pnRegistro);
    }//GEN-LAST:event_jButton1ActionPerformed


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
}
