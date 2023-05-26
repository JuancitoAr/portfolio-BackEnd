
package com.portfolio.ap.controller;

import com.portfolio.ap.interfaces.IEstudio;
import com.portfolio.ap.model.Estudio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudio")
public class EstudioController {
    
    @Autowired
    public IEstudio iEst;
    
    @GetMapping ("/listar")
    @ResponseBody
    public List<Estudio> getEstudio (){
    return iEst.getEstudios();
    }
    
    @PostMapping ("/crear")
    public void crearEstudio (@RequestBody Estudio estudio){
        iEst.saveEstudio(estudio);
    }
    
    @PutMapping ("/editar/{estudio_id}")
     public Estudio editarEstudio (@RequestBody Estudio estudio, @PathVariable Long estudio_id) {
        return iEst.updateEstudio(estudio, estudio_id);
    }
    
    @GetMapping("/id/{estudio_id}")
    public Estudio getEstudioById (@PathVariable Long estudio_id) {
        return iEst.findEstudioById(estudio_id);
    }
    
    @DeleteMapping ("/borrar/{estudio_id}")
    public void borrarEstudio (@PathVariable("estudio_id") Long estudio_id) {
        iEst.deleteEstudio(estudio_id);
    }
}
