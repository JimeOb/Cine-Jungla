/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.productos.strategypalomitas;

import co.edu.udistrital.cine.logica.confiteria.productos.strategypalomitas.Palomitas;

/**
 *
 * @author sjgar
 */
public class PalomitasMantequilla extends Palomitas {

    @Override
    public String AderezoPalomitas() {
        return "con mantequilla";
    }
    
}
