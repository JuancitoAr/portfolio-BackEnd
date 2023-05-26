
package com.portfolio.ap.controller;

import com.portfolio.ap.interfaces.IProyecto;
import com.portfolio.ap.model.Proyecto;
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
@RequestMapping("/proyecto")
public class ProyectoController {
    
    @Autowired
    public IProyecto iProye;
    
    @GetMapping ("/listar")
    @ResponseBody
    public List<Proyecto> getProyecto (){
    return iProye.getProyectos();
    }
    
    @PostMapping ("/crear")
    public void crearProyecto (@RequestBody Proyecto proyecto){
        iProye.saveProyecto(proyecto);
    }
    
    @PutMapping ("/editar/{proyecto_id}")
     public Proyecto editarProyecto (@RequestBody Proyecto proyecto, @PathVariable Long proyecto_id) {
        return iProye.updateProyecto(proyecto, proyecto_id);
    }
     
    @GetMapping("/id/{proyecto_id}")
    public Proyecto getProyectoById (@PathVariable Long proyecto_id) {
        return iProye.findProyectoById(proyecto_id);
    }
    
    @DeleteMapping ("/borrar/{proyecto_id}")
    public void borrarProyecto (@PathVariable("proyecto_id") Long proyecto_id) {
        iProye.deleteProyecto(proyecto_id);
    }
}
