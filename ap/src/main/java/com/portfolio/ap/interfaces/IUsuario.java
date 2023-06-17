
package com.portfolio.ap.interfaces;

import com.portfolio.ap.model.Usuario;
import java.util.List;


public interface IUsuario {
    
    // Trae lista de usuarios. Metodo para ser usado con Postman
    public List<Usuario> getUsuarios ();
    
    // Añade un usuario. Metodo para ser usado con Postman
    public void saveUsuario (Usuario usuario);
    
    // Elimina un usuario. Metodo para ser usado con Postman
    public void deleteUsuario (Long usuario_id);
    
    // Busca un usuario
    public Usuario findUsuarioById (Long usuario_id);
    
    // Actualiza un usuario completo.
    public Usuario updateUsuario(Usuario usuario, Long usuario_id);
    
    // Actualiza el perfil del usuario.
    public Usuario updateUsuarioPerfil(Usuario usuario, Long usuario_id);
    
    // Actualiza el acerca del usuario.
    public Usuario updateUsuarioAcerca(Usuario usuario, Long usuario_id);
    
}
