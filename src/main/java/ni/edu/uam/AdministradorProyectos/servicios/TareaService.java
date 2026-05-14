package ni.edu.uam.AdministradorProyectos.servicios;

import ni.edu.uam.AdministradorProyectos.modelos.Tarea;
import ni.edu.uam.AdministradorProyectos.repository.TareaRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TareaService {
    private final TareaRepo tareaRepo;

    public TareaService(TareaRepo tareaRepo) {
        this.tareaRepo = tareaRepo;
    }

    public List<Tarea> findAll() {
        return tareaRepo.findAll();
    }

    public Tarea getTareaById(Long id) {
        return tareaRepo.findById(id).orElse(null);
    }

    public Tarea saveTarea(Tarea tarea) {
        return tareaRepo.save(tarea);
    }

    public void deleteTarea(Long id) {
        tareaRepo.deleteById(id);
    }
}
