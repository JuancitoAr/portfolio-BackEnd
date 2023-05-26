
package com.portfolio.ap.interfaces;

import com.portfolio.ap.model.Skill;
import java.util.List;

public interface ISkill {
    
    // Trae lista skills
    public List<Skill> getSkills ();
    
    // Añade una skill
    public void saveSkill (Skill skill);
    
    // Elimina una skill
    public void deleteSkill (Long skill_id);
    
    // Busca una skill
    public Skill findSkillById (Long skill_id);
    
    // Actualiza una skill
    public Skill updateSkill(Skill skill, Long skill_id);
    
    // Trae una lista de las habilidades del tipo Duras
    public List<Skill> findAllfindAllHabilidadesDuras();
    
    // Trae una lista de las habilidades del tipo Blandas
    public List<Skill> findAllHabilidadesBlandas();
    
}
