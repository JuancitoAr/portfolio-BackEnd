
package com.portfolio.ap.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "login_usuarios")
public class LoginUsuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long login_usuario_id;
    
    private String email;
    private String password;
    
    @OneToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    public LoginUsuario() {
    }

    public LoginUsuario(Long login_usuario_id, String email, String password, Usuario usuario) {
        this.login_usuario_id = login_usuario_id;
        this.email = email;
        this.password = password;
        this.usuario = usuario;
    }
    
}
