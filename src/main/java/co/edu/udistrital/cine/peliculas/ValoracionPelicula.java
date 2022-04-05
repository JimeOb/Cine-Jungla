package co.edu.udistrital.cine.peliculas;

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
@Table(name = "valoraciones_peliculas")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ValoracionPelicula {
    
    @Id
    @Column(name = "id_valoracion_pelicula")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private Integer calificacion;
    
    @Column(length = 50)
    private String comentario;
    
    @ManyToOne
    @JoinColumn(name = "id_pelicula")
    private Pelicula pelicula;
    
    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;
    
}
