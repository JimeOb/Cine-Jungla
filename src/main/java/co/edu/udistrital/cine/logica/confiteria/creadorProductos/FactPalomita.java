/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.creadorProductos;

import co.edu.udistrital.cine.logica.confiteria.productos.strategypalomitas.Palomitas;
import co.edu.udistrital.cine.logica.confiteria.productos.strategypalomitas.PalomitasCaramelo;
import co.edu.udistrital.cine.logica.confiteria.productos.strategypalomitas.PalomitasMantequilla;
import co.edu.udistrital.cine.logica.confiteria.productos.strategypalomitas.PalomitasMix;

/**
 *
 * @author sjgar
 */
public class FactPalomita extends FactComida {
    
    
    public String factoryMethod(String aderezo) {
        Palomitas palomitas;
        if("mantequilla".equals(aderezo)){
            palomitas =  new PalomitasMantequilla();
            return palomitas.crearComida();
        }
        else if ("caramelo".equals(aderezo)){
            palomitas = new PalomitasCaramelo();
            return palomitas.crearComida();
        }
        else if("mix".equals(aderezo)){
            palomitas = new PalomitasMix();
            return palomitas.crearComida();
        }
        else{
            return "El tipo de palomitas seleccionado no existe";
        }
    }
    
}
