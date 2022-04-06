package co.edu.udistrital.cine.presentacion;

import lombok.Data;

@Data
public class PnOpcionesEmpleado extends javax.swing.JPanel {


    public PnOpcionesEmpleado(Vista vista) {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        btnCarteleraEmpleado = new javax.swing.JButton();
        btnReportesMultiplex = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("IAMGEN");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 28, 380, 120));

        btnCarteleraEmpleado.setBackground(new java.awt.Color(238, 28, 28));
        btnCarteleraEmpleado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnCarteleraEmpleado.setText("Ver cartelera del multiplex");
        add(btnCarteleraEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 218, 250, 90));

        btnReportesMultiplex.setBackground(new java.awt.Color(238, 28, 28));
        btnReportesMultiplex.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnReportesMultiplex.setText("Ver reportes del multiplex");
        add(btnReportesMultiplex, new org.netbeans.lib.awtextra.AbsoluteConstraints(69, 428, 250, 90));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarteleraEmpleado;
    private javax.swing.JButton btnReportesMultiplex;
    private javax.swing.JLabel jLabel11;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
