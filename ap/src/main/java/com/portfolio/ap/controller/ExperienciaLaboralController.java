
package com.portfolio.ap.controller;

import com.portfolio.ap.interfaces.IExperienciaLaboral;
import com.portfolio.ap.model.ExperienciaLaboral;
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
@RequestMapping("/experiencia")
public class ExperienciaLaboralController {
    
    @Autowired
    public IExperienciaLaboral iExp;
    
    @GetMapping ("/listar")
    @ResponseBody
    public List<ExperienciaLaboral> getExperienciaLaborarl (){
    return iExp.getExperienciasLaborales();
    }
    
    @PostMapping ("/crear")
    public void crearExperienciaLaborarl (@RequestBody ExperienciaLaboral experienciaLaboral){
        iExp.saveExperienciaLaboral(experienciaLaboral);
    }
    
    @PutMapping ("/editar/{experiencia_laboral_id}")
     public ExperienciaLaboral editarExperienciaLaboral (@RequestBody ExperienciaLaboral experienciaLaboral, @PathVariable Long experiencia_laboral_id) {
        return iExp.updateExperienciaLaboral(experienciaLaboral, experiencia_laboral_id);
    }
     
    @GetMapping("/id/{experiencia_laboral_id}")
    public ExperienciaLaboral getExperienciaLaboralById (@PathVariable Long experiencia_laboral_id) {
        return iExp.findExperienciaLaboralById(experiencia_laboral_id);
    }
    
    @DeleteMapping ("/borrar/{experiencia_laboral_id}")
    public void borrarExperienciaLaboral (@PathVariable("experiencia_laboral_id") Long experiencia_laboral_id) {
        iExp.deleteExperienciaLaboral(experiencia_laboral_id);
    }
}
