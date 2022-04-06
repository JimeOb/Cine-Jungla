package co.edu.udistrital.cine.presentacion;

import lombok.Data;

@Data
public class PnHorarios extends javax.swing.JPanel {

    public PnHorarios() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlTittle1 = new javax.swing.JLabel();
        lbnomPeliculaHorario = new javax.swing.JLabel();
        asdgvaxdsdefs = new javax.swing.JLabel();
        asdfwgvcasfvasf = new javax.swing.JLabel();
        cmbHora = new javax.swing.JComboBox<>();
        cmbMultiplex = new javax.swing.JComboBox<>();
        asdfwgvcasfvasf1 = new javax.swing.JLabel();
        cmbSala = new javax.swing.JComboBox<>();
        btnirSillas = new javax.swing.JButton();
        asdgvaxdsdefs1 = new javax.swing.JLabel();
        asdfwgvcasfvasf2 = new javax.swing.JLabel();
        cmbFecReserva = new javax.swing.JComboBox<>();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlTittle1.setBackground(new java.awt.Color(0, 0, 0));
        jlTittle1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlTittle1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTittle1.setText("IMAGEN");
        add(jlTittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(104, 24, 420, 120));

        lbnomPeliculaHorario.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lbnomPeliculaHorario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbnomPeliculaHorario.setText("Nombre de la pelicula selecionada");
        add(lbnomPeliculaHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 184, 590, 40));

        asdgvaxdsdefs.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdgvaxdsdefs.setText("Hora:");
        add(asdgvaxdsdefs, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 504, 70, -1));

        asdfwgvcasfvasf.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf.setText("Fecha de reserva:");
        add(asdfwgvcasfvasf, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 284, 190, 40));

        cmbHora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(cmbHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 494, 370, 50));

        cmbMultiplex.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(cmbMultiplex, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 354, 370, 50));

        asdfwgvcasfvasf1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf1.setText("Sala:");
        add(asdfwgvcasfvasf1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 424, 70, 40));

        cmbSala.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(cmbSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(214, 424, 370, 50));

        btnirSillas.setBackground(new java.awt.Color(153, 255, 153));
        btnirSillas.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnirSillas.setText("Ver asientos disponibles");
        btnirSillas.setBorder(null);
        add(btnirSillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 584, 210, 40));

        asdgvaxdsdefs1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdgvaxdsdefs1.setText("Hora:");
        add(asdgvaxdsdefs1, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 504, 70, -1));

        asdfwgvcasfvasf2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf2.setText("Multiplex:");
        add(asdfwgvcasfvasf2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 354, 140, 40));

        cmbFecReserva.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        add(cmbFecReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(274, 294, 310, 30));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asdfwgvcasfvasf;
    private javax.swing.JLabel asdfwgvcasfvasf1;
    private javax.swing.JLabel asdfwgvcasfvasf2;
    private javax.swing.JLabel asdgvaxdsdefs;
    private javax.swing.JLabel asdgvaxdsdefs1;
    private javax.swing.JButton btnirSillas;
    private javax.swing.JComboBox<String> cmbFecReserva;
    private javax.swing.JComboBox<String> cmbHora;
    private javax.swing.JComboBox<String> cmbMultiplex;
    private javax.swing.JComboBox<String> cmbSala;
    private javax.swing.JLabel jlTittle1;
    private javax.swing.JLabel lbnomPeliculaHorario;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
