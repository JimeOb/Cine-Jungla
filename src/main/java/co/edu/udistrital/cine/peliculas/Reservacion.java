package co.edu.udistrital.cine.peliculas;

import co.edu.udistrital.cine.logica.Silla;
import co.edu.udistrital.cine.logica.clientes.Cliente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "reservaciones")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Reservacion {
    
    @Id
    @Column(name = "id_reservacion")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "pago_realizado")
    private boolean pagoRealizado;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @ManyToOne
    @JoinColumn(name = "id_silla")
    private Silla silla;
    
    @ManyToOne
    @JoinColumn(name = "id_horario")
    private HorariosPelicula horario;
    
}
