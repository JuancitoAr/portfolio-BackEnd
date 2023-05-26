
package com.portfolio.ap.service;

import com.portfolio.ap.interfaces.IEstudio;
import com.portfolio.ap.model.Estudio;
import com.portfolio.ap.repository.EstudioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EstudioService implements IEstudio {

    @Autowired
    public EstudioRepository estudioRepo;
    
    @Override
    public List<Estudio> getEstudios() {
       return estudioRepo.findAll();
    }

    @Override
    public void saveEstudio(Estudio estudio) {
        estudioRepo.save(estudio);
    }

    @Override
    public void deleteEstudio(Long estudio_id) {
       estudioRepo.deleteById(estudio_id);
    }

    @Override
    public Estudio findEstudioById(Long estudio_id) {
       return estudioRepo.findById(estudio_id).orElse(null);
    }

    @Override
    public Estudio updateEstudio(Estudio estudio, Long estudio_id) {
      Optional<Estudio> localEstudio = estudioRepo.findById(estudio_id);
      Estudio estudioo = null;
      if (localEstudio.isPresent()){
          estudioo = localEstudio.get();
          estudioo.setNivel(estudio.getNivel());
          estudioo.setInstitucion(estudio.getInstitucion());
          estudioo.setTitulo(estudio.getTitulo());
          estudioo.setEstado(estudio.getEstado());
          estudioo.setDescripcion(estudio.getDescripcion());
          estudioo = estudioRepo.save(estudioo);
      }
      return estudioo;
    }
    
}
