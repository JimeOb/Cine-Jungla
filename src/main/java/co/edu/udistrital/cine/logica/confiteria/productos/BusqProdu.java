/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.productos;

import co.edu.udistrital.persistencia.Repository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sjgar
 */
public class BusqProdu {
    
    private Repository<ProductosMultiplex> repo = new Repository(ProductosMultiplex.class);
    private List<ProductosMultiplex> cons = new ArrayList();
    private Comida comida;
    
    public List<ProductosMultiplex> busPorMult(Integer multi){
       cons = repo.findByCriteria("id_multiplex = '" + multi +"'");
       return cons;
    }
    
    public List<ProductosMultiplex> busPorPro(Integer pro){
       cons = repo.findByCriteria("id_multiplex = '" + pro +"'");
       return cons;
    }
    
    public List<ProductosMultiplex> busPorMultPro(Integer multi, Integer pro){
       cons = repo.findByCriteria("id_multiplex = '" + multi +"' and id_producto = '"+pro+"'");
       return cons;
    }
    
    
}
