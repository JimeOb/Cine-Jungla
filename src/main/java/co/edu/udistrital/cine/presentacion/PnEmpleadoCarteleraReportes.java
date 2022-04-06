package co.edu.udistrital.cine.presentacion;

import lombok.Data;
//
@Data
public class PnEmpleadoCarteleraReportes extends javax.swing.JPanel {

    public PnEmpleadoCarteleraReportes(Vista vista) {
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("IMAGNE");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 10, 380, 120));

        lbNomMultiplexEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lbNomMultiplexEmpleado.setText("1000");
        add(lbNomMultiplexEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(181, 180, 310, 40));

        asdasdasf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdasdasf.setText("Multiplex:");
        add(asdasdasf, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 180, 140, 40));

        btnRegresaMenuEmpleado.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresaMenuEmpleado.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnRegresaMenuEmpleado.setText("Regresar");
        add(btnRegresaMenuEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(531, 560, 210, 50));

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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 240, 730, 160));
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
