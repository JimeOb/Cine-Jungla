/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.productos.strategypalomitas;

import co.edu.udistrital.cine.logica.confiteria.productos.Comida;

/**
 *
 * @author sjgar
 */
public abstract class Palomitas implements Comida {
    
    @Override
    public String crearComida(){
        return ("Palomitas" + AderezoPalomitas());
    }
    
    public abstract String AderezoPalomitas();
    
}
