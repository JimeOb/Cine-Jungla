package co.edu.udistrital.cine.presentacion;

import co.edu.udistrital.cine.logica.confiteria.creadorProductos.FactAlimento;
import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import java.awt.Label;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;


public class Modelo {

    private Vista ventana;
    private FactAlimento comida;
    
    public Vista getVentana() {
        if (ventana == null)
            ventana = new Vista(this);
        return ventana;
    }

    public void iniciar() {
        getVentana().setVisible(true);
        getVentana().setSize(810, 650);
    }
    /*
      public void llenarProductos(){
        List<Comida> cons = new ArrayList();
        jcNombCom.removeAllItems();
        cons = comida.verStock();
        
        for(int i = 0;i<cons.size(); i++){
            jcNombCom.addItem(cons.get(i).getNombre());
        }
      }  
    
     public void llenarCantidad(JComboBox jcNombCom, JComboBox jcCantCom){
        jcCantCom.removeAllItems();

        cons = comida.verStock();
        
        for(int i = 0;i<cons.size(); i++){
            if(jcNombCom.getSelectedItem().toString() == cons.get(i).getNombre()){
                for(int n = 0;n<=cons.get(n).getCantidad(); n++){  
                jcCantCom.addItem(n);
                }
            break;
            }
        }
    }
    
    public void cambiarImg(JComboBox jcNombCom, Label lbImg){
        
    }
*/
}
