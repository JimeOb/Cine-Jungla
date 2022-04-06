package co.edu.udistrital.cine.peliculas;

import co.edu.udistrital.cine.multiplex.Sala;
import java.time.LocalDateTime;

public class HorarioPeliculaBuilder {

    private HorariosPelicula horario;

    public HorarioPeliculaBuilder() {
        horario = new HorariosPelicula();
    }

    public HorarioPeliculaBuilder addId(Integer id) {
        horario.setId(id);
        return this;
    }
    
    public HorarioPeliculaBuilder addSala(Sala sala) {
        horario.setSala(sala);        
        return this;
    }
    
    public HorarioPeliculaBuilder addPelicula(Pelicula pelicula) {
        horario.setPelicula(pelicula);        
        return this;
    }
    
    public HorarioPeliculaBuilder addInicioPelicula(LocalDateTime inicio) {
        horario.setInicioPelicula(inicio);        
        return this;
    }
    
    public HorarioPeliculaBuilder addFinPelicula(LocalDateTime fin) {
        horario.setFinPelicula(fin);        
        return this;
    }
    
    public HorarioPeliculaBuilder addPrecio(Long precio) {
        horario.setPrecio(precio);        
        return this;
    }
    
    public HorariosPelicula build() {
        final HorariosPelicula buildHorario = horario;
        horario = new HorariosPelicula();
        return buildHorario;
    }
    
}
