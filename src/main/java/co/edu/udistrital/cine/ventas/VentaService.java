package co.edu.udistrital.cine.ventas;

import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.persistencia.Repository;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class VentaService {

    private Repository<Venta> repository;

    public VentaService(Repository<Venta> repository) {
        this.repository = repository;
    }
    
    public void agregarVenta(Venta venta) {
        repository.insert(venta);
    }
    
    public Iterator<Venta> getAllVentas() {
        return repository.findAll().iterator();
    }
    
    public Iterator<Venta> getVentasBetweenDates(LocalDate inicio, LocalDate fin) {
        
        final List<Venta> ventas = repository.findByCriteria(
                String.format("fecha between '%s' and '%s'", inicio, fin));
        
        return ventas.iterator();
    }
    
    public Iterator<Venta> getVentasByClient(Cliente cliente) {
        final List<Venta> ventas = repository.findByCriteria(
                String.format("cliente.id = %d", cliente.getId()));
        
        return ventas.iterator();
    }
    
    public void updateVenta(Venta venta) {
        repository.update(venta);
    }
    
    public void deleteVenta(Venta venta) {
        repository.delete(venta.getId());
    }
}
