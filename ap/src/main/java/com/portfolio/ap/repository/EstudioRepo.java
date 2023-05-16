
package com.portfolio.ap.repository;

import com.portfolio.ap.model.Estudio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudioRepo extends JpaRepository <Estudio, Long> {
    
}
