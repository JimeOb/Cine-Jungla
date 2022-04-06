package co.edu.udistrital.cine.ventas;

import co.edu.udistrital.cine.multiplex.Multiplex;
import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.LocalDate;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ventas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Venta {
    
    @Id
    @Column(name = "id_venta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "fecha_venta")
    private LocalDate fecha;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name = "id_multiplex")
    private Multiplex multiplex;
    
    @OneToMany
    @JoinColumn(name = "list_productos")
    private List<Comida> productos;
    
    
    

}
