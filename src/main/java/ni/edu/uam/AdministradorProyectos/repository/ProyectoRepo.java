package ni.edu.uam.AdministradorProyectos.repository;

import ni.edu.uam.AdministradorProyectos.modelos.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProyectoRepo extends JpaRepository<Proyecto, Long> {
}
