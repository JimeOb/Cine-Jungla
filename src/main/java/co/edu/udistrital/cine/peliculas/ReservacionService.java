package co.edu.udistrital.cine.peliculas;

import co.edu.udistrital.cine.logica.Silla;
import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.persistencia.Repository;
import java.util.Iterator;
import java.util.List;

public class ReservacionService {

    private final Repository<Reservacion> repository;

    public ReservacionService(Repository<Reservacion> repository) {
        this.repository = repository;
    }
    
    public void addReservation(Reservacion reservacion) {
        repository.insert(reservacion);
    }

    public Iterator<Reservacion> getReservationsByClient(Cliente cliente) {
        
        final List<Reservacion> reservations = repository.findByCriteria(
                String.format("cliente.id = %d", cliente.getId()));
        
        return reservations.iterator();
    }
    
    public Iterator<Reservacion> getReservationsByHorario(HorariosPelicula horario) {
        
        final List<Reservacion> reservations = repository.findByCriteria(
                String.format("horario.id = %d", horario.getId()));
        
        return reservations.iterator();
    }
    
    public Iterator<Reservacion> getReservationsBySilla(Silla sillla) {
        
        final List<Reservacion> reservations = repository.findByCriteria(
                String.format("silla.id = %d", sillla.getId()));
        
        return reservations.iterator();
    }
    
    public void updateReservation(Reservacion reservacion) {
        repository.update(reservacion);
    }
    
    public void deleteReservation(Reservacion reservacion) {
        repository.delete(reservacion.getId());
    }
    
    
}
