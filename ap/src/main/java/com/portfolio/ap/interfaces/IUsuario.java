
package com.portfolio.ap.interfaces;

import com.portfolio.ap.model.Usuario;
import java.util.List;


public interface IUsuario {
    
    // Trae lista de usuarios
    public List<Usuario> getUsuarios ();
    
    // Añade un usuario
    public void saveUsuario (Usuario usuario);
    
    // Elimina un usuario
    public void deleteUsuario (Long id);
    
    // Busca un usuario
    public Usuario findUsuarioById (Long id);
    
    // Actualiza un usuario
    public Usuario updateUsuario(Usuario usuario, Long usuario_id);
    
}
