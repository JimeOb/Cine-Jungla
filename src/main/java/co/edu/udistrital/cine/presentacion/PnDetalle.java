package co.edu.udistrital.cine.presentacion;

import lombok.Data;

@Data
public class PnDetalle extends javax.swing.JPanel {


    public PnDetalle() {
        initComponents();
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        btnIraPagar = new javax.swing.JButton();
        btnEliminarPedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lbPrecioaPagar = new javax.swing.JLabel();
        asdfwgvcasfvasf4 = new javax.swing.JLabel();
        asdfwgvcasfvasf5 = new javax.swing.JLabel();

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("IAMGEN");

        btnIraPagar.setBackground(new java.awt.Color(0, 204, 51));
        btnIraPagar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnIraPagar.setText("Pagar");

        btnEliminarPedido.setBackground(new java.awt.Color(238, 28, 28));
        btnEliminarPedido.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnEliminarPedido.setText("Cancelar pedido");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        lbPrecioaPagar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPrecioaPagar.setText("MoNtO :3");

        asdfwgvcasfvasf4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf4.setText("Detalles del pedido");

        asdfwgvcasfvasf5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf5.setText("TOTAL A PAGAR:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 708, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(160, 160, 160)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(asdfwgvcasfvasf4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 590, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(asdfwgvcasfvasf5, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(lbPrecioaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnEliminarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(270, 270, 270)
                            .addComponent(btnIraPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 9, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 611, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(asdfwgvcasfvasf4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(80, 80, 80)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(asdfwgvcasfvasf5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPrecioaPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEliminarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIraPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 11, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asdfwgvcasfvasf4;
    private javax.swing.JLabel asdfwgvcasfvasf5;
    private javax.swing.JButton btnEliminarPedido;
    private javax.swing.JButton btnIraPagar;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lbPrecioaPagar;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
