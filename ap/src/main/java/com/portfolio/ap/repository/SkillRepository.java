
package com.portfolio.ap.repository;

import com.portfolio.ap.model.Skill;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepository extends JpaRepository <Skill, Long> {
    @Query("SELECT s FROM Skill s WHERE s.habilidad = 'Habilidad Dura'")
    List<Skill> findAllHabilidadesDuras();
    
    @Query("SELECT s FROM Skill s WHERE s.habilidad = 'Habilidad Blanda'")
    List<Skill> findAllHabilidadesBlandas();
    
}
