package ni.edu.uam.AdministradorProyectos.modelos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "tareas")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tarea {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tarea")
    private Long id;

    @Column(name = "titulo_tarea", nullable = true, length = 50)
    private String titulo;

    @Column(name = "descripcion_tarea", nullable = true, length = 255)
    private String descripcion;

    @Column(name = "fecha_objetivo_tarea")
    private LocalDate fechaObjetivo;

    @Column(name = "estado_tarea",  nullable = false, length = 50)
    private String estado;

    @ManyToOne
    @JoinColumn(name = "proyecto_id", nullable = false)
    private Proyecto proyecto;
}
