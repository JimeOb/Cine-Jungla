/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.udistrital.cine.logica.confiteria.productos;

import co.edu.udistrital.cine.logica.Multiplex;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "productos_multiplex")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductosMultiplex {
    
    @Id
    @ManyToOne
    private Comida comida;
    
    @Id
    @ManyToOne
    private Multiplex multiplex;
    
    @Column
    private Integer cantidad;
    
}
