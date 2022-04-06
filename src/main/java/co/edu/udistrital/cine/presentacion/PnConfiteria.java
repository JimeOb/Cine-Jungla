package co.edu.udistrital.cine.presentacion;

import lombok.Data;

@Data
public class PnConfiteria extends javax.swing.JPanel {

    public PnConfiteria() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcNombCom = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        btnAnadirProductos = new javax.swing.JButton();
        btnIraPagarComida = new javax.swing.JButton();
        asdfwgvcasfvasf11 = new javax.swing.JLabel();
        asdfwgvcasfvasf12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtConfiteria = new javax.swing.JTable();

        jcNombCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("IMAGEN");

        btnAnadirProductos.setBackground(new java.awt.Color(204, 204, 204));
        btnAnadirProductos.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnAnadirProductos.setText("Añadir al carrito");

        btnIraPagarComida.setBackground(new java.awt.Color(102, 255, 51));
        btnIraPagarComida.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnIraPagarComida.setText("Ir a pagar");

        asdfwgvcasfvasf11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asdfwgvcasfvasf11.setText("Cantidad");

        asdfwgvcasfvasf12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asdfwgvcasfvasf12.setText("Item");

        jtConfiteria.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jtConfiteria);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 710, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(170, 170, 170)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(110, 110, 110)
                            .addComponent(asdfwgvcasfvasf12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(110, 110, 110)
                            .addComponent(asdfwgvcasfvasf11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(50, 50, 50)
                            .addComponent(jcNombCom, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(90, 90, 90)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(120, 120, 120)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAnadirProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(270, 270, 270)
                            .addComponent(btnIraPagarComida, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 598, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(asdfwgvcasfvasf12, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(asdfwgvcasfvasf11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jcNombCom, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnAnadirProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnIraPagarComida, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 9, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asdfwgvcasfvasf11;
    private javax.swing.JLabel asdfwgvcasfvasf12;
    private javax.swing.JButton btnAnadirProductos;
    private javax.swing.JButton btnIraPagarComida;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcNombCom;
    private javax.swing.JTable jtConfiteria;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
