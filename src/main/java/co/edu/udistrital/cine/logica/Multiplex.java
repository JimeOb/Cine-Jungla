package co.edu.udistrital.cine.logica;

import co.edu.udistrital.cine.empleado.Empleado;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "multiplex")
@Data
public class Multiplex {
    
    @Id
    @Column(name = "id_multiplex")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
    private String nombre;
    
    @Column(name = "cantidad_salas")
    private Integer cantidadSalas;    
    
    @OneToMany(mappedBy = "multiplex")    
    private List<Sala> salas;
    
    @OneToMany(mappedBy = "multiplex")
    private List<Empleado> empleados;
    
}
