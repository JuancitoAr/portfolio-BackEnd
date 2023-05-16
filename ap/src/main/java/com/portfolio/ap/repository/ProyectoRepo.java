
package com.portfolio.ap.repository;

import com.portfolio.ap.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepo extends JpaRepository <Proyecto, Long>{
    
}
