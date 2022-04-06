package co.edu.udistrital.cine.ventas;

import co.edu.udistrital.persistencia.Repository;
import java.time.LocalDate;
import java.time.Month;
import java.util.Iterator;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.BDDMockito;

public class VentaServiceIT {

    private Repository<Venta> repository;
    private VentaService service;

    @BeforeEach
    public void setup() {
        repository = new Repository<>(Venta.class);
        service = new VentaService(repository);
    }

    @Test
    public void testAgregarVenta() {
    }

    @Test
    public void testGetAllVentas() {
    }

    @Test
    public void testGetVentasBetweenDates() {

        final VentaBuilder builder = new VentaBuilder();
        List<Venta> ventas = List.of (
                builder
                        .addFecha(LocalDate.of(2000, Month.MARCH, 1))
                        .build(),
                builder
                        .addFecha(LocalDate.of(1999, Month.MARCH, 15))
                        .build(),
                builder
                        .addFecha(LocalDate.of(2001, Month.JUNE, 16))
                        .build()
        );
        
        ventas.forEach(service::agregarVenta);

        final Iterator<Venta> it = service.getVentasBetweenDates(
                LocalDate.of(1999, Month.MARCH, 15),
                LocalDate.of(2000, Month.MARCH, 1));
        
        int cant = 0;
        for(; it.hasNext(); ++cant)
            it.next();
        
        Assertions.assertEquals(2, cant);

    }

    @Test
    public void testGetVentasByClient() {
    }

    @Test
    public void testUpdateVenta() {
    }

    @Test
    public void testDeleteVenta() {
    }
}
