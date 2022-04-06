package co.edu.udistrital.cine.presentacion;

import javax.swing.JPanel;
import lombok.Data;

@Data
public class PnCliente extends javax.swing.JPanel {

    public PnCliente() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnComprarBoletos = new javax.swing.JButton();
        btnReporteCliente = new javax.swing.JButton();
        btnComprarConfiteria = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnComprarBoletos.setBackground(new java.awt.Color(238, 28, 28));
        btnComprarBoletos.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnComprarBoletos.setText("Comprar boletos");
        add(btnComprarBoletos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 250, 90));

        btnReporteCliente.setBackground(new java.awt.Color(238, 28, 28));
        btnReporteCliente.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnReporteCliente.setText("Ver reportes");
        add(btnReporteCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 350, 250, 90));

        btnComprarConfiteria.setBackground(new java.awt.Color(238, 28, 28));
        btnComprarConfiteria.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnComprarConfiteria.setText("Comprar comida");
        btnComprarConfiteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarConfiteriaActionPerformed(evt);
            }
        });
        add(btnComprarConfiteria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 250, 90));
    }// </editor-fold>//GEN-END:initComponents

    private void btnComprarConfiteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarConfiteriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnComprarConfiteriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComprarBoletos;
    private javax.swing.JButton btnComprarConfiteria;
    private javax.swing.JButton btnReporteCliente;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
    
}
