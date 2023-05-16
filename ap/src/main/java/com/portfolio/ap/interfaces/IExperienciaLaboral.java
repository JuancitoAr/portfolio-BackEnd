
package com.portfolio.ap.interfaces;

import com.portfolio.ap.model.ExperienciaLaboral;
import java.util.List;


public interface IExperienciaLaboral {
    
    // Trae lista de experiencia laborales
    public List<ExperienciaLaboral> getExperienciasLaborales ();
    
    // Añade una experiencia laboral
    public void saveExperienciaLaboral (ExperienciaLaboral experienciaLaboral);
    
    // Elimina una experiencia laboral
    public void deleteExperienciaLaboral (Long id);
    
    // Busca una experiencia laboral
    public ExperienciaLaboral findExperienciaLaboralById (Long id);
    
    // Actualiza una experiencia laboral
    public ExperienciaLaboral updateExperienciaLaboral(ExperienciaLaboral experienciaLaboral, Long experiencia_laboral_id);
    
}
