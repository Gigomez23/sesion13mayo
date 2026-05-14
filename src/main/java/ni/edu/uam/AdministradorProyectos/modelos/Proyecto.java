package ni.edu.uam.AdministradorProyectos.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "proyectos")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "proyecto_id")
    private Long id;

    @Column(name = "nombre_proyecto", nullable = false, unique = true, length = 50)
    private String nombre;

    @Column(name = "descripcion_proyecto", nullable = false, length = 255)
    private String descripcion;

    @Column(name = "presupuesto_proyecto", nullable = true, precision = 10, scale = 2)
    private BigDecimal presupuesto;

    @OneToMany(mappedBy = "proyecto", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tarea> tareas;

}
