package co.edu.udistrital.cine.peliculas;

import co.edu.udistrital.cine.multiplex.Sala;
import co.edu.udistrital.persistencia.Repository;
import java.util.Iterator;
import java.util.List;
import lombok.Data;

@Data
public class HorariosPeliculasService {
    
    private Repository<HorariosPelicula> repository;

    public HorariosPeliculasService(Repository<HorariosPelicula> repository) {
        this.repository = repository;
    }
    
    public void scheduleMovie(HorariosPelicula horario) {
        if(isSalaOcuppied(horario))
            throw new SalaOcupiedException("La sala no se encuentra disponible en ese horario");
        
        repository.insert(horario);                 
    }    
    
    private boolean isSalaOcuppied(HorariosPelicula horario) {
        
        final List<HorariosPelicula> salaReservations = repository
                .findByCriteria(String.format(
                        "sala.id = %d AND inicioPelicula = '%s'",
                        horario.getSala().getId(),
                        horario.getInicioPelicula()));
        
        return !salaReservations.isEmpty();
    }
    
    public void removeScheduleMovie(HorariosPelicula horario) {
        repository.delete(horario.getId());        
    }
    
    public void updateScheduleMovie(HorariosPelicula horario) {
        repository.update(horario);
    }
    
    public Iterator<HorariosPelicula> getSchedulesByMovie(Pelicula pelicula) {
        
        final List<HorariosPelicula> schedules = repository.findByCriteria(
                String.format("pelicula.id = %d", pelicula.getId()));
        
        return schedules.iterator();
    }
    
    public Iterator<HorariosPelicula> getSchedulesBySala(Sala sala) {
        
        final List<HorariosPelicula> schedules = repository.findByCriteria(
                String.format("sala.id = %d", sala.getId()));
        
        return schedules.iterator();
    }
}
