
package com.portfolio.ap.repository;

import com.portfolio.ap.model.LoginUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginUsuarioRepo extends JpaRepository <LoginUsuario, Long> {
    
}
