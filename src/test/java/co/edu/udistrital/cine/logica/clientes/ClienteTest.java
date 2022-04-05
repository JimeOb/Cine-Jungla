package co.edu.udistrital.cine.logica.clientes;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private Cliente cliente;    
    
    @BeforeEach
    public void setup() {
        cliente = new ClientBuilder()
                .addPuntos(0)
                .build();
    }
    
    @Test
    public void addLessThan100PointsTo0PointsShouldBeTheSameAmount() {
        
        cliente.addPoints(10);
        
        Assertions.assertEquals(10, cliente.getPuntos());
    }
    
    @Test
    public void addMoreThan100PointsTo0ShouldBeTheMod() {
        
        cliente.addPoints(110);
        
        Assertions.assertEquals(10, cliente.getPuntos());
    }

    @Test
    public void addLessThan100PointsButTheSumIsMoreThan100() {
        
        cliente.setPuntos(85);
        
        cliente.addPoints(20);
        
        Assertions.assertEquals(5, cliente.getPuntos());
    }
    
    @Test
    public void moreThan200PointsShouldConvertTo0To100Points() {
        cliente.setPuntos(95);
        
        cliente.addPoints(205);
        
        Assertions.assertEquals(0, cliente.getPuntos());
    }
    
    @Test
    public void noTicketsShouldBeGivenToClient() {
        cliente.setPuntos(95);
        
        Assertions.assertTrue( cliente.getBoletasPremio().isEmpty());
    }
    
    @Test
    public void oneTicketShouldBeGivedToClient() {
        cliente.setPuntos(95);
        cliente.addPoints(20);
        
        Assertions.assertEquals(1, cliente.getBoletasPremio().size());
    }
    
    @Test
    public void moreTicketsShouldBeGivedToClientIfHeAccumulateALotOfPoints() {
        cliente.setPuntos(95);
        cliente.addPoints(205);
        
        Assertions.assertEquals(3, cliente.getBoletasPremio().size());
    }
}
