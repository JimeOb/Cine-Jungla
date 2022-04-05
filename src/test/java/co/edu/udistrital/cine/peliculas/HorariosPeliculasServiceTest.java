package co.edu.udistrital.cine.peliculas;

import co.edu.udistrital.cine.logica.Sala;
import co.edu.udistrital.persistencia.Repository;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class HorariosPeliculasServiceTest {

    @Mock
    private Repository<HorariosPelicula> repository;
    
    @InjectMocks
    private HorariosPeliculasService service;
    
    @Test
    public void serviceShouldAddAMovieSchedule() {
        HorariosPelicula horario = generateHorarioPelicula();
        
        service.scheduleMovie(horario);
        
        ArgumentCaptor<HorariosPelicula> argument = ArgumentCaptor.forClass(HorariosPelicula.class);
        Mockito.verify(repository).insert(argument.capture());
        Assertions.assertEquals(horario, argument.getValue());
    }
    
    @Test
    public void serviceShouldThrowAnExpcetionTryingToAddHorario() {
        
        HorariosPelicula horario = generateHorarioPelicula();
        
        BDDMockito.given(repository
                .findByCriteria(ArgumentMatchers.anyString()))
                .willReturn(List.of(new HorariosPelicula()));
        
        SalaOcupiedException assertThrows = Assertions.assertThrows(
                SalaOcupiedException.class,
                () -> service.scheduleMovie(horario)
        );
        
        Assertions.assertEquals("La sala no se encuentra disponible en ese horario", assertThrows.getMessage());
        
    }
    
    @Test
    public void serviceShouldRemoveAMovieSchedule() {
        final HorariosPelicula horario = generateHorarioPelicula();

        service.removeScheduleMovie(horario);
        
        ArgumentCaptor<Integer> argument = ArgumentCaptor.forClass(Integer.class);
        Mockito.verify(repository).delete(argument.capture());
        Assertions.assertEquals(horario.getId(), argument.getValue());
    }
    
    @Test
    public void serviceShouldGetSchedulesByMovie() {
        BDDMockito.given(repository
                .findByCriteria(ArgumentMatchers.anyString()))
                .willReturn(List.of(new HorariosPelicula()));
        
        final Iterator<HorariosPelicula> it = service.getSchedulesByMovie(new Pelicula());
        
        int cantSchedules = 0;
        
        for(; it.hasNext(); ++cantSchedules)
            it.next();
        
        Assertions.assertEquals(1, cantSchedules);        
    }
    
    @Test
    public void serviceShouldGetSchedulesBySala() {
        
        BDDMockito.given(repository
                .findByCriteria(ArgumentMatchers.anyString()))
                .willReturn(List.of(new HorariosPelicula()));
        
        final Iterator<HorariosPelicula> it = service.getSchedulesBySala(new Sala());
        
        int cantSchedules = 0;
        
        for(; it.hasNext(); ++cantSchedules)
            it.next();
        
        Assertions.assertEquals(1, cantSchedules);    
    }
        
    public HorariosPelicula generateHorarioPelicula() {
        return new HorarioPeliculaBuilder()
                .addId(1)
                .addSala(new Sala())
                .addInicioPelicula(LocalDateTime.now())
                .build();
    }
}
