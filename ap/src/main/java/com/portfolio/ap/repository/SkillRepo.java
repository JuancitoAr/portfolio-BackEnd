
package com.portfolio.ap.repository;

import com.portfolio.ap.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillRepo extends JpaRepository <Skill, Long> {
    
}
