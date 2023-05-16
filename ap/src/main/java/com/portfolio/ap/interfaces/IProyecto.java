
package com.portfolio.ap.interfaces;

import com.portfolio.ap.model.Proyecto;
import java.util.List;


public interface IProyecto {
    
    // Trae lista de proyectos
    public List<Proyecto> getProyectos ();
    
    // Añade un proyecto
    public void saveProyecto (Proyecto proyecto);
    
    // Elimina un proyecto
    public void deleteProyecto (Long id);
    
    // Busca un proyecto
    public Proyecto findProyectoById (Long id);
    
    // Actualiza un proyecto
    public Proyecto updateProyecto(Proyecto proyecto, Long proyecto_id);
    
}
