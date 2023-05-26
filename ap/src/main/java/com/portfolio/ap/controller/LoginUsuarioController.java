
package com.portfolio.ap.controller;

import com.portfolio.ap.interfaces.ILoginUsuario;
import com.portfolio.ap.model.LoginUsuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loginuser")
public class LoginUsuarioController {
    
    @Autowired
    public ILoginUsuario iLoginUsu;
    
    
    @GetMapping ("/listar")
    @ResponseBody
    public List<LoginUsuario> getLoginUsuario (){
        return iLoginUsu.getLoginUsuarios();
    }
    
    @PostMapping ("/crear")
    public void crearLoginUsuario (@RequestBody LoginUsuario loginUsuario){
        iLoginUsu.saveloginUsuario(loginUsuario);
    }
    
    @PutMapping ("/editar/{login_usuario_id}")
     public LoginUsuario editarLoginUsuario (@RequestBody LoginUsuario loginUsuario, @PathVariable Long login_usuario_id) {
        return iLoginUsu.updateLoginUsuario(loginUsuario, login_usuario_id) ;
    }
    
    @GetMapping("/id/{login_usuario_id}")
    public LoginUsuario getLoginUsuarioById (@PathVariable Long login_usuario_id) {
        return iLoginUsu.findLoginUsuarioById(login_usuario_id);
    }
    
    @DeleteMapping ("/borrar/{login_usuario_id}")
    public void borrarLoginUsuario (@PathVariable("login_usuario_id") Long login_usuario_id) {
        iLoginUsu.deleteloginUsuario(login_usuario_id);
    }
    
}
