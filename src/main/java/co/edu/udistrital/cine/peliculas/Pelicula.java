package co.edu.udistrital.cine.peliculas;

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
@Table(name = "peliculas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Pelicula {
    
    @Id
    @Column(name = "id_pelicula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String nombre;
    
    @Column
    private String descripcion;
    
    @Column
    private String duracion;
    
    @Column(name = "ruta_imagen")
    private String rutaImagen;
    
    @OneToMany(mappedBy = "pelicula")
    private List<ValoracionPelicula> valoracionesPelicula;
    
}
