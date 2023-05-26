
package com.portfolio.ap.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "skills")
public class Skill {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long skill_id;
    
    private String tipo_habilidad;
    private String habilidad;
    private Long nivel;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_usuario_id")
    private Usuario usuario;  

    public Skill() {
    }

    public Skill(Long skill_id, String tipo_habilidad, String habilidad, Long nivel, Usuario usuario) {
        this.skill_id = skill_id;
        this.tipo_habilidad = tipo_habilidad;
        this.habilidad = habilidad;
        this.nivel = nivel;
        this.usuario = usuario;
    }
  
}
