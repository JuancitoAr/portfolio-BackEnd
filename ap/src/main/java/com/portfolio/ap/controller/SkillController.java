
package com.portfolio.ap.controller;

import com.portfolio.ap.interfaces.ISkill;
import com.portfolio.ap.model.Skill;
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
@RequestMapping("/skill")
public class SkillController {
    
    @Autowired
    public ISkill iSkill;
    
    @GetMapping ("/listar")
    @ResponseBody
    public List<Skill> getSkill (){
    return iSkill.getSkills();
    }
    
    @GetMapping ("/listhblanda")
    @ResponseBody
    public List<Skill> getSkillBlanda (){
    return iSkill.findAllHabilidadesBlandas();
    }
    
    @GetMapping ("/listhdura")
    @ResponseBody
    public List<Skill> getSkillDura (){
    return iSkill.findAllfindAllHabilidadesDuras();
    }
    
    @PostMapping ("/crear")
    public void crearSkill (@RequestBody Skill skill){
        iSkill.saveSkill(skill);
    }
    
    @PutMapping ("/editar/{skill_id}")
     public Skill editarSkill (@RequestBody Skill skill, @PathVariable Long skill_id) {
        return iSkill.updateSkill(skill, skill_id);
    }
     
    @PutMapping ("/editarcorta/{skill_id}")
     public Skill editarSkillCorta (@RequestBody Skill skill, @PathVariable Long skill_id) {
        return iSkill.updateSkill(skill, skill_id);
    }
     
    @GetMapping("/id/{skill_id}")
    public Skill getSkillById (@PathVariable Long skill_id) {
        return iSkill.findSkillById(skill_id);
    }
    
    @DeleteMapping ("/borrar/{skill_id}")
    public void borrarSkill (@PathVariable("skill_id") Long skill_id) {
        iSkill.deleteSkill(skill_id);
    }
    
}
