package co.edu.udistrital.cine.presentacion;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import lombok.Data;

@Data
public class Vista extends javax.swing.JFrame {

    public Vista() {
      initComponents();
      setLocationRelativeTo(null);
      setTitle("Cine Jungla Services");
      setDefaultCloseOperation(EXIT_ON_CLOSE);
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(233, 18, 18));
        jLabel5.setText("Usuario :");
        pnInfo.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 210, 50));

        jtxUsuario1.setBackground(new java.awt.Color(204, 204, 204));
        pnInfo.add(jtxUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 290, 40));

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
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
        pnInfo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, 180, 40));

        getContentPane().add(pnInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 650));

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
}
