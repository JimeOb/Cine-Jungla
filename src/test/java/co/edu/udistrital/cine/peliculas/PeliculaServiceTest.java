package co.edu.udistrital.cine.peliculas;

import co.edu.udistrital.persistencia.Repository;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class PeliculaServiceTest {
    
    @Mock
    private Repository<Pelicula> repoPeliculas;
    
    @InjectMocks
    private PeliculaService service;
    
    private Pelicula pelicula;

    @BeforeEach
    public void setup() {
        pelicula = new Pelicula();
    }
    
    @Test
    public void serviceShouldInsertAMovie() {
        service.insertarPelicula(pelicula);
        
        ArgumentCaptor<Pelicula> argument = ArgumentCaptor.forClass(Pelicula.class);
        Mockito.verify(repoPeliculas).insert(argument.capture());
        
        Assertions.assertEquals(pelicula, argument.getValue());
    }    
    
    @Test
    public void serviceShouldObtainAllTheMoviesAvailable() {
        
        Mockito.when(repoPeliculas.findAll())
                .thenReturn(List.of(new Pelicula(), new Pelicula()));
        
        final Iterator<Pelicula> it = service.getPeliculas();
        int cantidadPeliculas = 0;
        
        for(; it.hasNext(); ++cantidadPeliculas)
            it.next();
        
        Assertions.assertEquals(2, cantidadPeliculas);
    }
}
