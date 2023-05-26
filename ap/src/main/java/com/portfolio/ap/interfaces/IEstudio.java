
package com.portfolio.ap.interfaces;

import com.portfolio.ap.model.Estudio;
import java.util.List;


public interface IEstudio {
    
    // Trae lista de estudios
    public List<Estudio> getEstudios ();
    
    // Añade un estudio
    public void saveEstudio (Estudio estudio);
    
    // Elimina un estudio
    public void deleteEstudio (Long estudio_id);
    
    // Busca un estudio
    public Estudio findEstudioById (Long estudio_id);
    
    // Actualiza un estudio
    public Estudio updateEstudio(Estudio estudio, Long estudio_id);
    
}
