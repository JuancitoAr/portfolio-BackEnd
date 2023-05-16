
package com.portfolio.ap.service;

import com.portfolio.ap.interfaces.IExperienciaLaboral;
import com.portfolio.ap.model.ExperienciaLaboral;
import com.portfolio.ap.repository.ExperienciaLaboralRepo;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaLaboralService implements IExperienciaLaboral {
    
    @Autowired
    public ExperienciaLaboralRepo experienciaLaboralRepo;
    
    @Override
    public List<ExperienciaLaboral> getExperienciasLaborales (){
        return experienciaLaboralRepo.findAll();
    }
    
    @Override
    public void saveExperienciaLaboral (ExperienciaLaboral experienciaLaboral){
        experienciaLaboralRepo.save(experienciaLaboral);
    }
    
    @Override
    public void deleteExperienciaLaboral (Long id){
        experienciaLaboralRepo.deleteById(id);
    }
    
    @Override
    public ExperienciaLaboral findExperienciaLaboralById (Long id){
        return experienciaLaboralRepo.findById(id).orElse(null);
    }
    
    @Override
    public ExperienciaLaboral updateExperienciaLaboral(ExperienciaLaboral experienciaLaboral, Long experiencia_laboral_id){
        Optional<ExperienciaLaboral> localExperienciaLaboral = experienciaLaboralRepo.findById(experiencia_laboral_id); 
    }
    
    
}
