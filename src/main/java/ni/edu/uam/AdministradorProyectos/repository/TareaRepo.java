package ni.edu.uam.AdministradorProyectos.repository;

import ni.edu.uam.AdministradorProyectos.modelos.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepo extends JpaRepository<Tarea, Long> {
}
