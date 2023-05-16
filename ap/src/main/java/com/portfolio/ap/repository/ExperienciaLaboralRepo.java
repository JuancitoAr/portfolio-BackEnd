
package com.portfolio.ap.repository;

import com.portfolio.ap.model.ExperienciaLaboral;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienciaLaboralRepo extends JpaRepository <ExperienciaLaboral, Long>{
    
}
