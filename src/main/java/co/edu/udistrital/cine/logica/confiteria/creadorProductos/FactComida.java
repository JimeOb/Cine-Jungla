/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.creadorProductos;

/**
 *
 * @author sjgar
 */
public abstract class FactComida {
    
    public String ComidaConfiteriaFact(){
        return factoryMethod();
    }
public abstract String factoryMethod();
}
