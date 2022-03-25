/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.creadorProductos;

import co.edu.udistrital.cine.logica.confiteria.productos.Chocolatina;
import co.edu.udistrital.cine.logica.confiteria.productos.Comida;

/**
 *
 * @author sjgar
 */
public class FactChocolatina extends FactComida {
    
    Comida chocolatina = new Chocolatina();

    @Override
    public String factoryMethod() {
        return chocolatina.crearComida();
    }
    
}
