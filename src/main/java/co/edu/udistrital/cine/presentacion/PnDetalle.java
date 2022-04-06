package co.edu.udistrital.cine.presentacion;

import lombok.Data;
//
@Data
public class PnDetalle extends javax.swing.JPanel {


    public PnDetalle(Vista vista) {
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        jLabel13.setText("IAMGEN");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(169, 10, 380, 120));

        btnIraPagar.setBackground(new java.awt.Color(0, 204, 51));
        btnIraPagar.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnIraPagar.setText("Pagar");
        add(btnIraPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(489, 550, 210, 50));

        btnEliminarPedido.setBackground(new java.awt.Color(238, 28, 28));
        btnEliminarPedido.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnEliminarPedido.setText("Cancelar pedido");
        add(btnEliminarPedido, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 550, 210, 50));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 250, 590, 120));

        lbPrecioaPagar.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPrecioaPagar.setText("Monto");
        add(lbPrecioaPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(199, 450, 190, 40));

        asdfwgvcasfvasf4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf4.setText("Detalles del pedido");
        add(asdfwgvcasfvasf4, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 170, 290, 40));

        asdfwgvcasfvasf5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf5.setText("TOTAL A PAGAR:");
        add(asdfwgvcasfvasf5, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 450, 190, 40));
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
