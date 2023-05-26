
package com.portfolio.ap.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "estudios")
public class Estudio {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long estudio_id;
    
    private String nivel;
    private String institucion;
    private String titulo;
    private String estado;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    
     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "usuario_usuario_id")
     private Usuario usuario;

    public Estudio() {
    }

    public Estudio(Long estudio_id, String nivel, String institucion, String titulo, String estado, String descripcion, Usuario usuario) {
        this.estudio_id = estudio_id;
        this.nivel = nivel;
        this.institucion = institucion;
        this.titulo = titulo;
        this.estado = estado;
        this.descripcion = descripcion;
        this.usuario = usuario;
    }
   
}
