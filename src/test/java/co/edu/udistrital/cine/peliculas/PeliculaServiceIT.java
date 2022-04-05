package co.edu.udistrital.cine.peliculas;

import co.edu.udistrital.persistencia.Repository;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class PeliculaServiceIT {

    private Repository<Pelicula> repoPeliculas;
    private PeliculaService service;
    
    @BeforeEach
    public void setup() {
        repoPeliculas = new Repository<>(Pelicula.class);
        service = new PeliculaService(repoPeliculas);
    }
    
    @AfterEach
    public void tearDown() {
        repoPeliculas.deleteAll();
    }
    
    @Test
    public void serviceShouldAddOneMovie() {
        
        final Pelicula movie = createMovie();
        service.insertarPelicula(movie);
        
        final List<Pelicula> pelis = repoPeliculas.findAll();
        final Optional<Pelicula> savedMovie = repoPeliculas.findById(movie.getId());
        
        Assertions.assertEquals(1, pelis.size());
        Assertions.assertEquals(movie.getNombre(), savedMovie.get().getNombre());
        Assertions.assertEquals(movie.getId(), savedMovie.get().getId());
        Assertions.assertTrue(savedMovie.isPresent());
        
    }
    
    @Test
    public void serviceShouldAddMoreThanOneMovie() {

        for(int i = 0; i < 5; i++)
            service.insertarPelicula(createMovie());
        
        final List<Pelicula> pelis = repoPeliculas.findAll();
        
        Assertions.assertEquals(5, pelis.size());
    }

    @Test
    public void serviceShouldRemoveAnExistingMovie() {
        
        final Pelicula movie = createMovie();        
        service.insertarPelicula(movie);
        
        service.borrarPelicula(movie.getId());        
        final List<Pelicula> movies = repoPeliculas.findAll();
                
        Assertions.assertEquals(0, movies.size());
    }
    
    @Test
    public void serviceShouldThrowsAnExceptionWhenTryingToRemoveAnUnexistingMovie() {
        final NoSuchElementException exception = Assertions.assertThrows(
                NoSuchElementException.class,
                () -> service.borrarPelicula(99)
        );        
    }

    @Test
    public void serviceShouldReturnAnEmptyListOfMovies() {
        final List<Pelicula> movies = repoPeliculas.findAll();
        Assertions.assertTrue(movies.isEmpty());
    }
    
    public void serviceShouldReturnAListWithOneMovie() {
        
        repoPeliculas.insert(createMovie());        
        final List<Pelicula> movies = repoPeliculas.findAll();
        
        Assertions.assertEquals(1,movies.size());
    }

    @Test
    public void serviceShouldReturnAnExistingMovieById() {
        
        final Pelicula movie = createMovie();        
        repoPeliculas.insert(movie);
        
        final Optional<Pelicula> SearchedMovie = service.getPeliculaById(movie.getId());
        
        Assertions.assertEquals(movie.getNombre(), SearchedMovie.get().getNombre());
        
    }
    
    @Test
    public void serviceShouldDoesntFindAMovieById() {  
        final Optional<Pelicula> SearchedMovie = service.getPeliculaById(99);
        
        Assertions.assertTrue(SearchedMovie.isEmpty());
    }

    @Test
    public void serviceShouldUpdateAMovie() {
        final Pelicula movie = createMovie();        
        repoPeliculas.insert(movie);
        
        movie.setNombre("Spiderman 2");
        repoPeliculas.update(movie);
        
        final Optional<Pelicula> searchMovie = repoPeliculas.findById(movie.getId());
        Assertions.assertEquals(movie.getNombre(), searchMovie.get().getNombre());
    }
    
    public Pelicula createMovie() {
        return new PeliculaBuilder()
                .addNombre("Spiderman")
                .addDescripcion("Action movie")
                .addDuracion("120 mins")
                .addRutaImagen("path")
                .addValoracion(List.of())
                .build();         
    }    
}
