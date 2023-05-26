
package com.portfolio.ap.service;

import com.portfolio.ap.interfaces.ILoginUsuario;
import com.portfolio.ap.model.LoginUsuario;
import com.portfolio.ap.repository.LoginUsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginUsuarioService implements ILoginUsuario {

    @Autowired
    public LoginUsuarioRepository loginUsuarioRepo;  
    
    @Override
    public List<LoginUsuario> getLoginUsuarios() {
        return loginUsuarioRepo.findAll();
    }

    @Override
    public void saveloginUsuario(LoginUsuario loginUsuario) {
        loginUsuarioRepo.save(loginUsuario);
    }

    @Override
    public void deleteloginUsuario(Long login_usuario_id) {
        loginUsuarioRepo.deleteById(login_usuario_id);
    }

    @Override
    public LoginUsuario findLoginUsuarioById(Long login_usuario_id) {
        return loginUsuarioRepo.findById(login_usuario_id).orElse(null);
    }

    @Override
    public LoginUsuario updateLoginUsuario(LoginUsuario loginUsuario, Long login_usuario_id) {
        Optional<LoginUsuario> localLoginUsuario = loginUsuarioRepo.findById(login_usuario_id);
        LoginUsuario loginUsuarioo = null;
        if (localLoginUsuario.isPresent()){
            loginUsuarioo = localLoginUsuario.get();
            loginUsuarioo.setEmail(loginUsuario.getEmail());
            loginUsuarioo.setPassword(loginUsuario.getPassword());
            loginUsuarioo = loginUsuarioRepo.save(loginUsuarioo);
        }
        return loginUsuario;                
    }
    
}
