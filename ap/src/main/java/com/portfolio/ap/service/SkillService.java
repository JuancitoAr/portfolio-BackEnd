
package com.portfolio.ap.service;

import com.portfolio.ap.interfaces.ISkill;
import com.portfolio.ap.model.Skill;
import com.portfolio.ap.repository.SkillRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService implements ISkill {

    @Autowired
    public SkillRepository skillRepo;
    
    @Override
    public List<Skill> getSkills() {
        return skillRepo.findAll();
    }
    
    @Override
    public List<Skill> findAllfindAllHabilidadesDuras() {
        return skillRepo.findAllHabilidadesDuras();
    }

    @Override
    public List<Skill> findAllHabilidadesBlandas() {
        return skillRepo.findAllHabilidadesBlandas();
    }

    @Override
    public void saveSkill(Skill skill) {
        skillRepo.save(skill);
    }

    @Override
    public void deleteSkill(Long skill_id) {
        skillRepo.deleteById(skill_id);
    }

    @Override
    public Skill findSkillById(Long skill_id) {
        return skillRepo.findById(skill_id).orElse(null);
    }

    @Override
    public Skill updateSkill(Skill skill, Long skill_id) {
        Optional<Skill> localSkill = skillRepo.findById(skill_id);
        Skill skilll = null;
        if (localSkill.isPresent()){
            skilll = localSkill.get();
            skilll.setTipo_habilidad(skill.getTipo_habilidad());
            skilll.setHabilidad(skill.getHabilidad());
            skilll.setNivel(skill.getNivel());
            skilll = skillRepo.save(skilll);
        }
        return skilll;
    }
    
    @Override
    public Skill updateSkillCorta(Skill skill, Long skill_id) {
        Optional<Skill> localSkill = skillRepo.findById(skill_id);
        Skill skilll = null;
        if (localSkill.isPresent()){
            skilll = localSkill.get();
            skilll.setHabilidad(skill.getHabilidad());
            skilll.setNivel(skill.getNivel());
            skilll = skillRepo.save(skilll);
        }
        return skilll;
    }

}
