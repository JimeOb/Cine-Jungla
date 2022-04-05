package co.edu.udistrital.cine.logica.clientes;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import java.time.Clock;
import java.time.LocalDate;
import java.time.Period;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "boletas_premio")
@Data
@NoArgsConstructor
public class BoletaPremio {
    
    @Id
    @Column(name = "id_boleta_premio")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "fecha_expiracion")
    private LocalDate fechaExpiracion;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
    @Transient
    private Clock clock;

    public BoletaPremio(Clock clock) {
        this.clock = clock;
        this.fechaExpiracion = LocalDate.now(clock).plusMonths(6);
    }
    
    /**
     * Verifica si la boleta aun se encuentra vigente o si ya expiró
     * @return validez de la boleta
     */
    public boolean isValid() {        
        return Period.between(fechaExpiracion, LocalDate.now(clock)).isNegative();        
    }    
}
