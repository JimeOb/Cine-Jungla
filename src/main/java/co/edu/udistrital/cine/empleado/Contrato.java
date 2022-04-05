package co.edu.udistrital.cine.empleado;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "contratos")
public class Contrato {
    
    @Id
    @Column(name = "id_contrato")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private Long salario;
    
    @Column(name = "fecha_inicio")
    private LocalDate fechaInicio;
    
}
