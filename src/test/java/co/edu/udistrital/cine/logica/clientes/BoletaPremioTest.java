package co.edu.udistrital.cine.logica.clientes;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BoletaPremioTest {

    private BoletaPremio boleta;
    @Mock
    private Clock clock;
    
    private Clock fixedClock = Clock.fixed(
            Instant.parse("2022-04-04T00:00:00.00Z"),
            ZoneId.systemDefault());
    
    @BeforeEach
    public void setup() {
        Mockito.doReturn(fixedClock.instant()).when(clock).instant();
        Mockito.doReturn(fixedClock.getZone()).when(clock).getZone();

        boleta = new BoletaPremio(clock);
    }
    
    @Test
    public void boletaShouldBeValid() {
       
        Assertions.assertTrue(boleta.isValid());
    }

    @Test
    public void boletaShouldBeInvalid() {
        
        final Clock clock1 = Clock.offset(fixedClock, Duration.ofDays(200));        
        boleta.setClock(clock1);

        Assertions.assertFalse(boleta.isValid());
    }
}
