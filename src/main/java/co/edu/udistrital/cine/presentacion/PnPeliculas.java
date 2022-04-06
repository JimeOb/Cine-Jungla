package co.edu.udistrital.cine.presentacion;

import lombok.Data;

@Data
public class PnPeliculas extends javax.swing.JPanel {

    public PnPeliculas() {
        initComponents();
    }

    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbPelicula1 = new javax.swing.JButton();
        jbPelicula3 = new javax.swing.JButton();
        jbPelicula4 = new javax.swing.JButton();
        jbPelicula5 = new javax.swing.JButton();
        jbPelicula6 = new javax.swing.JButton();
        jlTittle = new javax.swing.JLabel();
        jbPelicula2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbPelicula1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula1.setText("PELICULA1");
        add(jbPelicula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 149, 180, 290));

        jbPelicula3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula3.setText("PELICULA3");
        add(jbPelicula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 149, 190, 290));

        jbPelicula4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula4.setText("PELICULA4");
        jbPelicula4.setToolTipText("");
        add(jbPelicula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 469, 190, 300));

        jbPelicula5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula5.setText("PELICULA5");
        jbPelicula5.setToolTipText("");
        add(jbPelicula5, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 469, 190, 300));

        jbPelicula6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula6.setText("PELICULA6");
        add(jbPelicula6, new org.netbeans.lib.awtextra.AbsoluteConstraints(525, 469, 190, 300));

        jlTittle.setBackground(new java.awt.Color(0, 0, 0));
        jlTittle.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jlTittle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlTittle.setText("IMAGEN");
        add(jlTittle, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 9, 420, 120));

        jbPelicula2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jbPelicula2.setText("PELICULA2");
        add(jbPelicula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 149, 190, 290));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbPelicula1;
    private javax.swing.JButton jbPelicula2;
    private javax.swing.JButton jbPelicula3;
    private javax.swing.JButton jbPelicula4;
    private javax.swing.JButton jbPelicula5;
    private javax.swing.JButton jbPelicula6;
    private javax.swing.JLabel jlTittle;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
