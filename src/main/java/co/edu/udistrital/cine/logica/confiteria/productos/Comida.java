package co.edu.udistrital.cine.logica.confiteria.productos;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "productos_confiteria")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Comida {
    
    @Id
    @Column(name = "id_producto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;
    
    @Column(nullable = false)
    private String nombre;
    @Column(nullable = false)
    private Integer precio;
    @OneToMany(mappedBy = "comida")
    private List<ProductosMultiplex> productos;
   
}
