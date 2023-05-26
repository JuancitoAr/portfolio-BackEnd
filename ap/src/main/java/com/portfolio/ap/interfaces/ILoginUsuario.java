
package com.portfolio.ap.interfaces;

import com.portfolio.ap.model.LoginUsuario;
import java.util.List;


public interface ILoginUsuario {
    
    // Trae lista de cuentas de usuarios. Metodo para ser usado con Postman
    public List<LoginUsuario> getLoginUsuarios ();
    
    // Añade una cuenta de usuario. Metodo para ser usado con Postman
    public void saveloginUsuario (LoginUsuario loginUsuario);
    
    // Elimina una cuenta de usuario segun su id. Metodo para ser usado con Postman
    public void deleteloginUsuario (Long login_usuario_id);
    
    // Busca una cuenta de usuario segun su id
    public LoginUsuario findLoginUsuarioById (Long login_usuario_id);
    
    // Actualiza una cuenta de usuario. Metodo para ser usado con Postman
    public LoginUsuario updateLoginUsuario (LoginUsuario loginUsuario, Long login_usuario_id);
    
}
