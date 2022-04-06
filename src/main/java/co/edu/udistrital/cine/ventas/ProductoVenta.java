package co.edu.udistrital.cine.ventas;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "productos_venta")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductoVenta {
    
    @EmbeddedId
    private ProductoVentaIdentity pk;    
    
    @Column    
    private Integer cantidad;
    
}
