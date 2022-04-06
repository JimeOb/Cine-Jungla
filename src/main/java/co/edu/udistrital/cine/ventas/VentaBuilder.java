package co.edu.udistrital.cine.ventas;

import co.edu.udistrital.cine.multiplex.Multiplex;
import co.edu.udistrital.cine.logica.clientes.Cliente;
import java.time.LocalDate;

public class VentaBuilder {

    private Venta venta;

    public VentaBuilder() {
        venta = new Venta();
    }

    public VentaBuilder addId(Integer id) {
        venta.setId(id);
        return this;
    }
    
    public VentaBuilder addFecha(LocalDate fecha) {
        venta.setFecha(fecha);
        return this;
    }
    
    public VentaBuilder addCliente(Cliente cliente) {
        venta.setCliente(cliente);
        return this;
    }
    
    public VentaBuilder addMultiplex(Multiplex multiplex) {
        venta.setMultiplex(multiplex);
        return this;
    }
    
    public Venta build() {
        final Venta buildVenta = venta;
        venta = new Venta();        
        return buildVenta;
    }
    
}
