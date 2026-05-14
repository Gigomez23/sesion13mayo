package ni.edu.uam.AdministradorProyectos.servicios;

import ni.edu.uam.AdministradorProyectos.modelos.Proyecto;
import ni.edu.uam.AdministradorProyectos.repository.ProyectoRepo;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProyectoService {
    private final ProyectoRepo proyectoRepo;

    public ProyectoService(ProyectoRepo proyectoRepo) { this.proyectoRepo = proyectoRepo; }

    public List<Proyecto> findAll() { return proyectoRepo.findAll(); }

    public Proyecto getProyectoById(Long id) { return proyectoRepo.findById(id).orElse(null); }

    public Proyecto saveProyecto(Proyecto proyecto) { return  proyectoRepo.save(proyecto); }

    public void deleteProyecto(Long id) { proyectoRepo.deleteById(id); }
}

