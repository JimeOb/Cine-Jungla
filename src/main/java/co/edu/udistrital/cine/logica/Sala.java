package co.edu.udistrital.cine.logica;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "id_sala")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Sala {

    @Id
    @Column(name = "id_sala")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "numero_sala")
    private Integer numeroSala;
    
    @Column(name = "capacidad")
    private Integer capacidad;
    
    @ManyToOne
    @JoinColumn(name = "id_multiplex")
    private Multiplex multiplex;
    
    @OneToMany(mappedBy = "sala")
    private List<Silla> sillas;
    
}
