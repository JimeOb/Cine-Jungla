package co.edu.udistrital.cine.presentacion;

import lombok.Data;
//
@Data
public class PnEstadoCliente extends javax.swing.JPanel {


    public PnEstadoCliente(Vista vista) {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        lbNombreCliente = new javax.swing.JLabel();
        asdfwgvcasfvasf8 = new javax.swing.JLabel();
        lbNumPuntos = new javax.swing.JLabel();
        asdfwgvcasfvasf10 = new javax.swing.JLabel();
        btnRegresaMenu = new javax.swing.JButton();
        lbPeliculaReserva = new javax.swing.JLabel();
        asdfwgvcasfvasf11 = new javax.swing.JLabel();
        lbNumBoletasCompradas = new javax.swing.JLabel();
        asdfwgvcasfvasf12 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtBoletasPuntos = new javax.swing.JTable();
        btnRedimirBoletas = new javax.swing.JButton();
        asdfwgvcasfvasf13 = new javax.swing.JLabel();
        cmbIdBoletasRedimibles = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/CINE.jpg"))); // NOI18N
        jLabel14.setText("IAMGEN");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 9, 380, 90));

        lbNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNombreCliente.setText("nombre del cliente ");
        add(lbNombreCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 550, 40));

        asdfwgvcasfvasf8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf8.setText("Cliente:");
        add(asdfwgvcasfvasf8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 100, 40));

        lbNumPuntos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNumPuntos.setText("value");
        add(lbNumPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 80, 40));

        asdfwgvcasfvasf10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf10.setText("Puntos obtenidos: ");
        add(asdfwgvcasfvasf10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 200, 40));

        btnRegresaMenu.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresaMenu.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnRegresaMenu.setText("Regresar");
        add(btnRegresaMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 210, 50));

        lbPeliculaReserva.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbPeliculaReserva.setText("value");
        add(lbPeliculaReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 310, 40));

        asdfwgvcasfvasf11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf11.setText("Pelicula reservada:");
        add(asdfwgvcasfvasf11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 200, 40));

        lbNumBoletasCompradas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNumBoletasCompradas.setText("value");
        add(lbNumBoletasCompradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 320, 40));

        asdfwgvcasfvasf12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf12.setText("ID Boleta:");
        add(asdfwgvcasfvasf12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 110, 40));

        jtBoletasPuntos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtBoletasPuntos);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 410, 160));

        btnRedimirBoletas.setBackground(new java.awt.Color(204, 204, 204));
        btnRedimirBoletas.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnRedimirBoletas.setText("Redimir boletas");
        add(btnRedimirBoletas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 560, 210, 50));

        asdfwgvcasfvasf13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf13.setText("Boletas reservadas:");
        add(asdfwgvcasfvasf13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 210, 40));

        cmbIdBoletasRedimibles.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        add(cmbIdBoletasRedimibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 490, 140, 40));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asdfwgvcasfvasf10;
    private javax.swing.JLabel asdfwgvcasfvasf11;
    private javax.swing.JLabel asdfwgvcasfvasf12;
    private javax.swing.JLabel asdfwgvcasfvasf13;
    private javax.swing.JLabel asdfwgvcasfvasf8;
    private javax.swing.JButton btnRedimirBoletas;
    private javax.swing.JButton btnRegresaMenu;
    private javax.swing.JComboBox<String> cmbIdBoletasRedimibles;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtBoletasPuntos;
    private javax.swing.JLabel lbNombreCliente;
    private javax.swing.JLabel lbNumBoletasCompradas;
    private javax.swing.JLabel lbNumPuntos;
    private javax.swing.JLabel lbPeliculaReserva;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
