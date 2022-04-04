package co.edu.udistrital.cine.logica.clientes;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credentials {

    @Column
    private String email;

    @Column
    private String password;

}
