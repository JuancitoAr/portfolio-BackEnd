
package com.portfolio.ap.repository;

import com.portfolio.ap.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends JpaRepository <Usuario, Long> {
    
}
