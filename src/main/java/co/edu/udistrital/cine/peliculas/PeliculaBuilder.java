package co.edu.udistrital.cine.peliculas;

import java.util.List;

public class PeliculaBuilder {

    private Pelicula pelicula;

    public PeliculaBuilder() {
        this.pelicula = new Pelicula();
    } 
    
    public PeliculaBuilder addNombre(String nombre) {
        pelicula.setNombre(nombre);
        return this;
    }
    
    public PeliculaBuilder addDescripcion(String descripcion) {
        pelicula.setDescripcion(descripcion);        
        return this;
    }
    
    public PeliculaBuilder addDuracion(String duracion) {
        pelicula.setDuracion(duracion);        
        return this;
    }
    
    public PeliculaBuilder addRutaImagen(String rutaImagen) {
        pelicula.setRutaImagen(rutaImagen);        
        return this;
    }
    
    public PeliculaBuilder addValoracion(List<ValoracionPelicula> valoraciones) {
        pelicula.setValoracionesPelicula(valoraciones);        
        return this;
    }    
    
    public Pelicula build() {
        Pelicula peliBuild = pelicula;
        pelicula = new Pelicula();
        return peliBuild;
    }    
}
