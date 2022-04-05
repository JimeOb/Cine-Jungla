package co.edu.udistrital.cine.empleado;

import co.edu.udistrital.cine.logica.clientes.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

@Entity
@Table(name = "empleados")
@Data
@AllArgsConstructor
public class Empleado extends User {

    @Id
    @Column(name = "id_empleado")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NaturalId
    @Column(name = "codigo_empleado")
    private Long codigo;
    
    @Column
    private Long cedula;
        
    @Enumerated(EnumType.STRING)
    @Column
    private Cargo cargo;
    
    @Column
    private String telefono;
    
    @OneToOne
    @JoinColumn(name = "id_contrato")
    private Contrato contrato;
    
}
