/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.creadorProductos;

import co.edu.udistrital.cine.logica.confiteria.productos.Chocolatina;
import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import co.edu.udistrital.cine.logica.confiteria.productos.Gaseosa;
import co.edu.udistrital.cine.logica.confiteria.productos.Nachos;
import co.edu.udistrital.cine.logica.confiteria.productos.PerroCaliente;
import co.edu.udistrital.cine.logica.confiteria.productos.Sandwich;


/**
 *
 * @author sjgar
 */
public class FactAlimento extends FactComida {

    

    @Override
    public String factoryMethod(String comida) {
     if("chocolatina".equals(comida.toLowerCase())){
        Comida chocolatina = new Chocolatina();
        return chocolatina.crearComida();
     }
     else if("gaseosa".equals(comida.toLowerCase())){
         Comida gaseosa = new Gaseosa();
         return gaseosa.crearComida();
     }
     else if("nachos".equals(comida.toLowerCase())){
         Comida nachos = new Nachos();
         return nachos.crearComida();
     }
     else if("perro caliente".equals(comida.toLowerCase())){
         Comida perroCa = new PerroCaliente();
         return perroCa.crearComida();
     }
     else if("mantequilla".equals(comida.toLowerCase()) || "caramelo".equals(comida.toLowerCase()) || "mix".equals(comida.toLowerCase())){
         FactPalomita palomitas = new FactPalomita();
         return palomitas.factoryMethod(comida);
     }
     else if("sandwich".equals(comida.toLowerCase())){
         Comida sandwich = new Sandwich();
         return sandwich.crearComida();
     }
     else{
         return "El producto seleccionado no existe";
     }
    }
    
    
    
    
    
}
