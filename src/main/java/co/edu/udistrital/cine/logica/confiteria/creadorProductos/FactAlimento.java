/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.creadorProductos;


import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import co.edu.udistrital.persistencia.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author sjgar
 */
public class FactAlimento {
    
    Repository<Comida> repo = new Repository(Comida.class);
    List<Comida> cons = new ArrayList();
    Comida comida;
    
    public List<Comida> entregaComi(List<String> nombre, List<Integer> cant) {
        
     List<Comida> lista = new ArrayList();
     
     
     for(int i = 0;i<=cant.size(); i++){
         
           cons = repo.findByCriteria("nombre = '"+ nombre.get(i) + "'");
           comida = cons.get(0);
           comida.setCantidad(cant.get(i));
           lista.add(comida);
     }
     return lista;
     
    }
    
    
    
    public List<Comida> verStock(){

        return repo.findAll();
        
    }
    
    public void rellenarStock(Comida comida){
        comida.setCantidad(15);
        repo.update(comida);
        
    }
    
    public List<String> nomb(){
        List<String> list = new ArrayList();
        cons = this.verStock();
        for(int i = 0;i<=cons.size(); i++){
            list.add(cons.get(i).getNombre());
        }
        
        
        return list;
    }

    
    
    
    
}