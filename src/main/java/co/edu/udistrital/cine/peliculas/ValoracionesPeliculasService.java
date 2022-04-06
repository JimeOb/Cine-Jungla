package co.edu.udistrital.cine.peliculas;

import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.persistencia.Repository;
import java.util.Iterator;
import java.util.List;

public class ValoracionesPeliculasService {

    private Repository<ValoracionPelicula> repository;

    public ValoracionesPeliculasService(Repository<ValoracionPelicula> repository) {
        this.repository = repository;
    }
    
    public void addValoracion(ValoracionPelicula valoracionPelicula) {
        repository.insert(valoracionPelicula);
    }
    
    public Iterator<ValoracionPelicula> getValoracionesByMovie(Pelicula pelicula) {
        
        final List<ValoracionPelicula> valoraciones = repository.findByCriteria(
                String.format("pelicula.id = %d", pelicula.getId()));
        
        return valoraciones.iterator();
    }
    
    public Iterator<ValoracionPelicula> getValoracionesByCliente(Cliente cliente) {
        
        final List<ValoracionPelicula> valoraciones = repository.findByCriteria(
                String.format("cliente.id = %d", cliente.getId()));
        
        return valoraciones.iterator();
    }
    
    public void updateValoracion(ValoracionPelicula valoracion) {
        repository.update(valoracion);
    }
    
    public void deleteValoracion(ValoracionPelicula valoracion) {
        repository.delete(valoracion.getId());
    }
    
}
