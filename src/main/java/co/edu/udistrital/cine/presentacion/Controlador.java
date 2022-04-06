package co.edu.udistrital.cine.presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controlador implements ActionListener{
    
   private final Modelo modelo;

   public Controlador(Vista ventana) {
        this.modelo = ventana.getModelo();
    }  
   
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
