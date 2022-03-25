/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.creadorProductos;

import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import co.edu.udistrital.cine.logica.confiteria.productos.strategypalomitas.PalomitasCaramelo;
import co.edu.udistrital.cine.logica.confiteria.productos.strategypalomitas.PalomitasMantequilla;
import co.edu.udistrital.cine.logica.confiteria.productos.strategypalomitas.PalomitasMix;

/**
 *
 * @author sjgar
 */
public class FactPalomitas extends FactComida {
    
    Comida palomitas;
    
    public String factoryMethod(String aderezo) {
        if("mantequilla".equals(aderezo)){
            palomitas =  new PalomitasMantequilla();
            return palomitas.crearComida();
        }
        else if ("caramelo".equals(aderezo)){
            palomitas = new PalomitasCaramelo();
            return palomitas.crearComida();
        }
        else{
            palomitas = new PalomitasMix();
            return palomitas.crearComida();
        }
    }

    @Override
    public String factoryMethod() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
