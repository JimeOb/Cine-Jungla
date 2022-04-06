package co.edu.udistrital.cine.presentacion;

import co.edu.udistrital.cine.logica.confiteria.creadorProductos.FactAlimento;
import co.edu.udistrital.cine.logica.confiteria.productos.BusqProdu;
import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import co.edu.udistrital.cine.logica.confiteria.productos.ProductosMultiplex;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import lombok.Data;

@Data
public class PnConfiteria extends javax.swing.JPanel {

    private FactAlimento comida;
    private List<Comida> cons;
    private List<ProductosMultiplex> consCant;
    private BusqProdu busq;

    public PnConfiteria() {
        initComponents();
    }
    
    public void llenarProductos(){
        cons = new ArrayList();
        cons = comida.verProductos();
        jcNombCom.removeAllItems();
        
        for(int i = 0;i<cons.size(); i++){
            jcNombCom.addItem(cons.get(i).getNombre());
        }
      }  
    
     public void llenarCantidad(JComboBox jcNombCom, JComboBox jcCantCom, Integer multiplex){
        jcCantCom.removeAllItems();
        cons = comida.verProductos();
        
        for(int i = 0;i<cons.size(); i++){
            if(jcNombCom.getSelectedItem().toString() == cons.get(i).getNombre()){
                consCant = busq.busPorMultPro(multiplex, cons.get(i).getIdProducto());
                for(int n = 0;n<=consCant.get(0).getCantidad(); n++){  
                    jcCantCom.addItem(n);
                }
            break;
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jcNombCom = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        btnAnadirProductos = new javax.swing.JButton();
        btnIraPagarComida = new javax.swing.JButton();
        asdfwgvcasfvasf11 = new javax.swing.JLabel();
        asdfwgvcasfvasf12 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtConfiteria = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lbNommultiplex = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jcNombCom.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jcNombCom, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 330, 50));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 90, 50));

        btnAnadirProductos.setBackground(new java.awt.Color(204, 204, 204));
        btnAnadirProductos.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnAnadirProductos.setText("Añadir al carrito");
        add(btnAnadirProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 539, 210, 50));

        btnIraPagarComida.setBackground(new java.awt.Color(102, 255, 51));
        btnIraPagarComida.setFont(new java.awt.Font("Bell MT", 0, 18)); // NOI18N
        btnIraPagarComida.setText("Ir a pagar");
        add(btnIraPagarComida, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 540, 210, 50));

        asdfwgvcasfvasf11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asdfwgvcasfvasf11.setText("Cantidad");
        add(asdfwgvcasfvasf11, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 200, 40));

        asdfwgvcasfvasf12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        asdfwgvcasfvasf12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        asdfwgvcasfvasf12.setText("Item");
        add(asdfwgvcasfvasf12, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 200, 40));

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

        add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 410, 230));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel1.setText("Multiplex:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 80, 40));

        lbNommultiplex.setBackground(new java.awt.Color(255, 255, 255));
        lbNommultiplex.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lbNommultiplex.setText("Nombre pelicula");
        add(lbNommultiplex, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 320, 20));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel asdfwgvcasfvasf11;
    private javax.swing.JLabel asdfwgvcasfvasf12;
    private javax.swing.JButton btnAnadirProductos;
    private javax.swing.JButton btnIraPagarComida;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jcNombCom;
    private javax.swing.JTable jtConfiteria;
    private javax.swing.JLabel lbNommultiplex;
    // End of variables declaration//GEN-END:variables

    private void capturarEventos() {
 
        
        
    }
}
