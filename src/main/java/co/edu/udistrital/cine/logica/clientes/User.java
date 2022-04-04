package co.edu.udistrital.cine.logica.clientes;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import lombok.Getter;

@MappedSuperclass
@Data
public abstract class User {
    
    @Embedded
    private Credentials credentials;   
    
    @Enumerated(EnumType.ORDINAL)
    @Column(name = "id_role")
    @Getter private Role role;
    
    @Column
    private String nombre;
    
    public String getEmail() {
        return credentials.getEmail();
    }    
}
