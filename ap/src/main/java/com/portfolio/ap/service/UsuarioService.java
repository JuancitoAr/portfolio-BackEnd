
package com.portfolio.ap.service;

import com.portfolio.ap.interfaces.IUsuario;
import com.portfolio.ap.model.Usuario;
import com.portfolio.ap.repository.UsuarioRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuario{

    @Autowired
    public UsuarioRepository usuarioRepo;
    
    @Override
    public List<Usuario> getUsuarios() {
        return usuarioRepo.findAll();
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuarioRepo.save(usuario);
    }

    @Override
    public void deleteUsuario(Long usuario_id) {
        usuarioRepo.deleteById(usuario_id);
    }

    @Override
    public Usuario findUsuarioById(Long usuario_id) {
        return usuarioRepo.findById(usuario_id).orElse(null);

    }

    @Override
    public Usuario updateUsuario(Usuario usuario, Long usuario_id) {
        Optional<Usuario> localUsuario = usuarioRepo.findById(usuario_id);
        Usuario usuarioo = null;
        if (localUsuario.isPresent()){
            usuarioo = localUsuario.get();
            usuarioo.setApellido(usuario.getApellido());
            usuarioo.setNombre(usuario.getNombre());
            usuarioo.setTitulo(usuario.getTitulo());
            usuarioo.setFoto(usuario.getFoto());
            usuarioo.setDescripcion(usuario.getDescripcion());
            usuarioo = usuarioRepo.save(usuarioo);     
        }
        return usuarioo;
    }
    
}