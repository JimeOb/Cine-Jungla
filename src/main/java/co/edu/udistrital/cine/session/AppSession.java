package co.edu.udistrital.cine.session;

import co.edu.udistrital.cine.logica.clientes.User;
import java.time.Clock;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Optional;
import lombok.Data;

@Data
public class AppSession {

    public static final int SESSION_EXPIRATION_TIME_IN_MINUTES = 5;

    private Optional<User> loggedUser;
    private LocalDateTime expiration;
    private Clock clock;

    public AppSession(Clock clock) {
        this.clock = clock;
        extendSession();
    }

    public final void extendSession() {
        expiration = LocalDateTime.now(clock)
                .plusMinutes(SESSION_EXPIRATION_TIME_IN_MINUTES);
    }
    
    public final boolean isActive() {
        final Duration diff = Duration.between(expiration, LocalDateTime.now(clock));
        return diff.isNegative() || diff.isZero();
    }
}
