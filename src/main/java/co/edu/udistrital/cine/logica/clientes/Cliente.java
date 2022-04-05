package co.edu.udistrital.cine.logica.clientes;

import co.edu.udistrital.cine.peliculas.Reservacion;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente extends User {

    private static final int MAX_POINTS = 100;
    
    @Id
    @Column(name = "id_cliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private Integer puntos;
    
    @OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
    private List<BoletaPremio> boletasPremio = new ArrayList<>();
    
    @OneToMany(mappedBy = "cliente")
    private List<Reservacion> reservaciones;

    public void addPoints(Integer puntos) {        
        this.puntos += puntos; 
        
        for(; this.puntos >= MAX_POINTS ; this.puntos -= MAX_POINTS)
            addBoletaPremio();        
    }    
    
    private void addBoletaPremio() {        
        final BoletaPremio boleta = new BoletaPremio(Clock.systemDefaultZone());
        boleta.setCliente(this);
        
        boletasPremio.add(boleta);
    }
    
    public Iterator<BoletaPremio> getBoletasPremio() {
        return boletasPremio.iterator();
    }
}
