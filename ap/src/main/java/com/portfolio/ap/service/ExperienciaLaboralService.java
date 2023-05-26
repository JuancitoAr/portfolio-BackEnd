
package com.portfolio.ap.service;

import com.portfolio.ap.interfaces.IExperienciaLaboral;
import com.portfolio.ap.model.ExperienciaLaboral;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.portfolio.ap.repository.ExperienciaLaboralRepository;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboral {

    @Autowired
    public ExperienciaLaboralRepository experienciaLaboralRepo;
    
    @Override
    public List<ExperienciaLaboral> getExperienciasLaborales() {
        return experienciaLaboralRepo.findAll();
    }

    @Override
    public void saveExperienciaLaboral(ExperienciaLaboral experienciaLaboral) {
        experienciaLaboralRepo.save(experienciaLaboral);
    }
    
    @Override
    public void deleteExperienciaLaboral(Long experiencia_laboral_id) {
       experienciaLaboralRepo.deleteById(experiencia_laboral_id);
    }

    @Override
    public ExperienciaLaboral findExperienciaLaboralById(Long experiencia_laboral_id) {
       return experienciaLaboralRepo.findById(experiencia_laboral_id).orElse(null);
    }

    @Override
    public ExperienciaLaboral updateExperienciaLaboral(ExperienciaLaboral experienciaLaboral, Long experiencia_laboral_id) {
       Optional<ExperienciaLaboral> localExperienciaLaboral = experienciaLaboralRepo.findById(experiencia_laboral_id);
       ExperienciaLaboral expLab = null;
       if (localExperienciaLaboral.isPresent()){
            expLab = localExperienciaLaboral.get();
            expLab.setTitulo(experienciaLaboral.getTitulo());
            expLab.setDescripcion(experienciaLaboral.getDescripcion());
            expLab.setImagen(experienciaLaboral.getImagen());
            expLab = experienciaLaboralRepo.save(expLab);
       }
       return expLab;
    }    
    
}
