package co.edu.udistrital.cine.logica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "sillas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Silla {
    
    @Id
    @Column(name = "id_silla")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "numero_silla")
    private Integer numeroSilla;
    
    @ManyToOne
    @JoinColumn(name = "id_sala")
    private Sala sala;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_silla")
    private TipoSilla tipoSilla;
    
}
