package co.edu.udistrital.cine.ventas;

import co.edu.udistrital.cine.multiplex.Multiplex;
import co.edu.udistrital.cine.logica.clientes.Cliente;
import co.edu.udistrital.cine.logica.confiteria.productos.Comida;
import java.time.LocalDate;
import java.util.List;

public class VentaBuilder {

    private Venta venta;
    private ProductoVentaIdentity produVentaIden;
    private ProductoVenta produVenta;

    public VentaBuilder() {
        venta = new Venta();
        produVenta = new ProductoVenta();
        produVentaIden = new ProductoVentaIdentity();
        
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
    public VentaBuilder addProductos(List<Comida> productos){
        venta.setProductos(productos);
        return this;
    }
    
    public Venta build() {
        final Venta buildVenta = venta;
        venta = new Venta();        
        return buildVenta;
    }
    
}
