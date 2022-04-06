package co.edu.udistrital.cine.presentacion;

import lombok.Data;

@Data
public class PnEstadoCliente extends javax.swing.JPanel {


    public PnEstadoCliente() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel14 = new javax.swing.JLabel();
        lbNombreCliente = new javax.swing.JLabel();
        asdfwgvcasfvasf8 = new javax.swing.JLabel();
        lbNumPuntos = new javax.swing.JLabel();
        asdfwgvcasfvasf10 = new javax.swing.JLabel();
        btnboletaGratis = new javax.swing.JButton();
        btnRegresaMenu = new javax.swing.JButton();

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("IAMGEN");

        lbNombreCliente.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNombreCliente.setText("nombre del cliente :v");

        asdfwgvcasfvasf8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf8.setText("Cliente:");

        lbNumPuntos.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNumPuntos.setText("1000");

        asdfwgvcasfvasf10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf10.setText("Puntos obtenidos: ");

        btnboletaGratis.setBackground(new java.awt.Color(0, 204, 51));
        btnboletaGratis.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnboletaGratis.setText("Obtener boleta gratis!");

        btnRegresaMenu.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresaMenu.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnRegresaMenu.setText("Regresar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 759, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(180, 180, 180)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(asdfwgvcasfvasf8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(lbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(asdfwgvcasfvasf10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(70, 70, 70)
                                    .addComponent(btnboletaGratis, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbNumPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(530, 530, 530)
                            .addComponent(btnRegresaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 10, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 618, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(asdfwgvcasfvasf8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(150, 150, 150)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(asdfwgvcasfvasf10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnboletaGratis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNumPuntos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(160, 160, 160)
                    .addComponent(btnRegresaMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asdfwgvcasfvasf10;
    private javax.swing.JLabel asdfwgvcasfvasf8;
    private javax.swing.JButton btnRegresaMenu;
    private javax.swing.JButton btnboletaGratis;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel lbNombreCliente;
    private javax.swing.JLabel lbNumPuntos;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
