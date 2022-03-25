/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.creadorProductos;

import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import co.edu.udistrital.cine.logica.confiteria.productos.PerroCaliente;

/**
 *
 * @author sjgar
 */
public class FactPerroCaliente extends FactComida {
    
    Comida perroCaliente = new PerroCaliente();

    @Override
    public String factoryMethod() {
        return perroCaliente.crearComida();
    }
    
}
