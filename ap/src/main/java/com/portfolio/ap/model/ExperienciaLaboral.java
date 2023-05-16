
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
@Table(name = "experiencias_laborales")
public class ExperienciaLaboral {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long experiencia_laboral_id;
    private String titulo;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    private String imagen;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_usuario_id")
    private Usuario usuario;
    
    public ExperienciaLaboral() {
    }
    
    public ExperienciaLaboral(Long experiencia_laboral_id, String titulo, String descripcion, String imagen) {
        this.experiencia_laboral_id = experiencia_laboral_id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;   
    }
    
}
