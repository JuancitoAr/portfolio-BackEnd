
package com.portfolio.ap.interfaces;

import com.portfolio.ap.model.LoginUsuario;
import java.util.List;


public interface ILoginUsuario {
    
    // Trae lista de usuarios
    public List<LoginUsuario> getLoginUsuarios ();
    
    // Añade un usuario
    public void saveloginUsuario (LoginUsuario loginUsuario);
    
    // Elimina un usuario
    public void deleteloginUsuario (Long id);
    
    // Busca un usuario
    public LoginUsuario findLoginUsuarioById (Long id);
    
    // Actualiza un usuario
    public LoginUsuario updateLoginUsuario (LoginUsuario loginUsuario, Long login_usuario_id);
    
}
