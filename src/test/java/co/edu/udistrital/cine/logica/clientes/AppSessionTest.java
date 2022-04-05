package co.edu.udistrital.cine.logica.clientes;

import co.edu.udistrital.cine.session.AppSession;
import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.lenient;

@ExtendWith(MockitoExtension.class)
public class AppSessionTest {
    
    private AppSession appSession;
    
    @Mock private Clock clock;

    private final Clock fixedClock = Clock.fixed(
                Instant.parse("2022-04-04T05:00:00.00Z"), 
                ZoneId.systemDefault());
    
    @BeforeEach
    public void setup() {        
        lenient().doReturn(fixedClock.instant()).when(clock).instant();
        lenient().doReturn(fixedClock.getZone()).when(clock).getZone();
            
        appSession = new AppSession(clock);        
    }
    
    @Test
    public void appSessionShouldBeActive() {        
        final boolean active = appSession.isActive();  
        
        Assertions.assertTrue(active);        
    }
    
    @Test
    public void appSessionShouldBeInvalidateByInactivity() {
        
        Clock off = Clock.offset(
                fixedClock,
                Duration.ofMinutes(AppSession.SESSION_EXPIRATION_TIME_IN_MINUTES)
                        .plusSeconds(1)
        );        
        appSession.setClock(off);
        
        final boolean active = appSession.isActive();        
        
        Assertions.assertFalse(active);
    }
    
    @Test
    public void appSessionShouldBeExtendedByActivity() {

        final LocalDateTime initial = appSession.getExpiration();
        
        Clock off = Clock.offset(fixedClock, Duration.ofSeconds(1));
        appSession.setClock(off);        
        appSession.extendSession();      
        
        final LocalDateTime terminal = appSession.getExpiration();        
        Assertions.assertTrue(terminal.isAfter(initial));
        
    }    
}
