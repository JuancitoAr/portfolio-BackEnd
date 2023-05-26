
package com.portfolio.ap.service;

import com.portfolio.ap.interfaces.IProyecto;
import com.portfolio.ap.model.Proyecto;
import com.portfolio.ap.repository.ProyectoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyecto {

    @Autowired
    public ProyectoRepository proyectoRepo;
    
    @Override
    public List<Proyecto> getProyectos() {
        return proyectoRepo.findAll();
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        proyectoRepo.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long proyecto_id) {
        proyectoRepo.deleteById(proyecto_id);
    }

    @Override
    public Proyecto findProyectoById(Long proyecto_id) {
        return proyectoRepo.findById(proyecto_id).orElse(null);
    }

    @Override
    public Proyecto updateProyecto(Proyecto proyecto, Long proyecto_id) {
        Optional<Proyecto> localProyecto = proyectoRepo.findById(proyecto_id);
        Proyecto proyect = null;
       if (localProyecto.isPresent()){
            proyect = localProyecto.get();
            proyect.setTitulo(proyecto.getTitulo());
            proyect.setFecha_inicio(proyecto.getFecha_inicio());
            proyect.setDescripcion(proyecto.getDescripcion());
            proyect.setLink(proyecto.getLink());
            proyect.setMascara(proyecto.getMascara());
            proyect = proyectoRepo.save(proyect);
       }
       return proyect;    
    }
    
}
