package co.edu.udistrital.cine.presentacion;

import lombok.Data;

@Data
public class PnOpcionesEmpleado extends javax.swing.JPanel {


    public PnOpcionesEmpleado() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        btnCarteleraEmpleado = new javax.swing.JButton();
        btnReportesMultiplex = new javax.swing.JButton();

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("IAMGEN");

        btnCarteleraEmpleado.setBackground(new java.awt.Color(238, 28, 28));
        btnCarteleraEmpleado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnCarteleraEmpleado.setText("Ver cartelera del multiplex");

        btnReportesMultiplex.setBackground(new java.awt.Color(238, 28, 28));
        btnReportesMultiplex.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnReportesMultiplex.setText("Ver reportes del multiplex");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 419, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 19, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnCarteleraEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnReportesMultiplex, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 20, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 547, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 28, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(70, 70, 70)
                    .addComponent(btnCarteleraEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(120, 120, 120)
                    .addComponent(btnReportesMultiplex, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 29, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarteleraEmpleado;
    private javax.swing.JButton btnReportesMultiplex;
    private javax.swing.JLabel jLabel11;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
