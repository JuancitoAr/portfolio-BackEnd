
package com.portfolio.ap.controller;

import com.portfolio.ap.interfaces.IUsuario;
import com.portfolio.ap.model.Usuario;
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
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    public IUsuario iUsu;
    
    @GetMapping ("/listar")
    @ResponseBody
    public List<Usuario> getUsuario (){
    return iUsu.getUsuarios();
    }
    
    @PostMapping ("/crear")
    public void crearUsuario (@RequestBody Usuario usuario){
        iUsu.saveUsuario(usuario);
    }
    
    @PutMapping ("/editar/{usuario_id}")
     public Usuario editarUsuario (@RequestBody Usuario usuario, @PathVariable Long usuario_id) {
        return iUsu.updateUsuario(usuario, usuario_id);
    }
     
    @GetMapping("/id/{usuario_id}")
    public Usuario getUsuarioById (@PathVariable Long usuario_id) {
        return iUsu.findUsuarioById(usuario_id);
    }
    
    @DeleteMapping ("/borrar/{usuario_id}")
    public void borrarUsuario (@PathVariable("usuario_id") Long usuario_id) {
        iUsu.deleteUsuario(usuario_id);
    }
}
