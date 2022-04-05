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
    private String nombre;
    private int precio;
    private int cantidad;

    public Palomitas() {
    }

    public Palomitas(String nombre, int precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    @Override
    public String crearComida(){
        return ("Palomitas" + AderezoPalomitas());
    }
    
    public abstract String AderezoPalomitas();
    
}
