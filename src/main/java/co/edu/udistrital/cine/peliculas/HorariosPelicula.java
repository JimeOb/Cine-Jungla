package co.edu.udistrital.cine.peliculas;

import co.edu.udistrital.cine.logica.Sala;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "horarios_peliculas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class HorariosPelicula {
    
    @Id
    @Column(name = "id_horario_pelicula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private Long precio;
    
    @Column(name = "inicio_pelicula")
    private LocalDateTime inicioPelicula;
    
    @Column(name = "fin_pelicula")
    private LocalDateTime finPelicula;
    
    @ManyToOne
    @JoinColumn(name = "id_pelicula")
    private Pelicula pelicula;
    
    @ManyToOne
    @JoinColumn(name = "id_sala")
    private Sala sala;
    
}
