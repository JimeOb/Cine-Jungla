package co.edu.udistrital.cine.ventas;

import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import jakarta.persistence.Embeddable;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
public final class ProductoVentaIdentity implements Serializable {
    
    @ManyToOne
    private Venta venta;
    
    @ManyToOne
    private Comida comida;
    
}
