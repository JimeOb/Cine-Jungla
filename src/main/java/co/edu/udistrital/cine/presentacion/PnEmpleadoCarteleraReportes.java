package co.edu.udistrital.cine.presentacion;

import lombok.Data;

@Data
public class PnEmpleadoCarteleraReportes extends javax.swing.JPanel {

    public PnEmpleadoCarteleraReportes() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        lbNomMultiplexEmpleado = new javax.swing.JLabel();
        asdasdasf = new javax.swing.JLabel();
        btnRegresaMenuEmpleado = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtEmpleado = new javax.swing.JTable();

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("IMAGNE");

        lbNomMultiplexEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNomMultiplexEmpleado.setText("1000");

        asdasdasf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdasdasf.setText("Multiplex:");

        btnRegresaMenuEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresaMenuEmpleado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnRegresaMenuEmpleado.setText("Regresar");

        jtEmpleado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtEmpleado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 11, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(asdasdasf, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(130, 130, 130)
                                    .addComponent(lbNomMultiplexEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 730, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(520, 520, 520)
                            .addComponent(btnRegresaMenuEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 621, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(50, 50, 50)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(asdasdasf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNomMultiplexEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(160, 160, 160)
                    .addComponent(btnRegresaMenuEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asdasdasf;
    private javax.swing.JButton btnRegresaMenuEmpleado;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtEmpleado;
    private javax.swing.JLabel lbNomMultiplexEmpleado;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
