/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.creadorProductos;


import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import co.edu.udistrital.cine.logica.confiteria.productos.ProductosMultiplex;
import co.edu.udistrital.persistencia.Repository;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author sjgar
 */
public class FactAlimento {
    
    Repository<ProductosMultiplex> repoCant = new Repository(ProductosMultiplex.class);
    List<ProductosMultiplex> consCant = new ArrayList();
    ProductosMultiplex produCant;
    
    public void actualizarComi(List<Comida> comida, Integer multiplex, List<Integer> cantidad) {
        
        for(int i = 0;i<comida.size(); i++){
         
           consCant = repoCant.findByCriteria("id_producto = '"+ comida.get(i).getIdProducto() + "' and id_multiplex = '"+multiplex+"'");
           produCant = consCant.get(i);
           produCant.setCantidad(produCant.getCantidad() - (cantidad.get(i)));
        }
    }
    
    public void rellenarStock(Comida comida, Integer multiplex){
        consCant = repoCant.findByCriteria("id_producto = '"+ comida.getIdProducto() + "' and id_multiplex = '"+multiplex+"'");
        produCant = consCant.get(0);
        produCant.setCantidad(15);
        repoCant.update(produCant);
        
    }
    
    public List<ProductosMultiplex> verStockG(){

        return repoCant.findAll();
        
    }
    
    public List<ProductosMultiplex> verStockP(Integer multiplex){

        return repoCant.findByCriteria("id_multiplex = '"+ multiplex + "'");
        
    }

    
}
