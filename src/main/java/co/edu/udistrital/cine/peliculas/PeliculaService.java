package co.edu.udistrital.cine.peliculas;

import co.edu.udistrital.persistencia.Repository;
import java.util.Iterator;
import java.util.Optional;
import lombok.Data;

@Data
public class PeliculaService {
    
    private final Repository<Pelicula> repoPeliculas;

    public PeliculaService(Repository<Pelicula> repoPeliculas) {
        this.repoPeliculas = repoPeliculas;
    }
    
    public void insertarPelicula(Pelicula pelicula) {
        repoPeliculas.insert(pelicula);        
    }    
    
    public void borrarPelicula(Integer idPelicula) {
        repoPeliculas.delete(idPelicula);
    }
    
    public Iterator<Pelicula> getPeliculas() {
        return repoPeliculas
                .findAll()
                .iterator();
    }
    
    public Optional<Pelicula> getPeliculaById(Integer id) {
        return repoPeliculas.findById(id);
    }
    
    public void actualizarInfoPelicula(Pelicula pelicula) {
        repoPeliculas.update(pelicula);
    }
}
