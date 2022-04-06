/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.udistrital.cine.presentacion;

import co.edu.udistrital.cine.logica.confiteria.creadorProductos.FactAlimento;
import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import java.awt.Label;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author USER
 */
public class Modelo {

    private static Modelo instance;

    private VistaSillas vistaSillas;
    private VistaMain vistaMain;
    private VistaMultiplex vistaMultiplex;
    private VistaConfiteria vistaConfiteria;
    
    private Modelo() {
        vistaSillas = new VistaSillas();
        vistaMain = new VistaMain();
        vistaMultiplex = new VistaMultiplex();
        vistaConfiteria = new VistaConfiteria();
    }

    public static Modelo getInstance() {
        if (instance == null) {
            instance = new Modelo();
        }
        return instance;
    }

    public VistaSillas getVistaSillas() {
        return vistaSillas;
    }

    public VistaMain getVistaMain() {
        return vistaMain;
    }

    public VistaMultiplex getVistaMultiplex() {
        return vistaMultiplex;
    }
    public VistaConfiteria getVistaConfiteria(){
        return vistaConfiteria;
    }

    public void iniciar() {
        vistaMain.setVisible(true);
        
    }
    
    
    
    
    
    private FactAlimento comida = new FactAlimento();
    
    List<Comida> cons = new ArrayList();
    
    public void llenarProductos(){
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
    

}
