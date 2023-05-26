
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
@Table(name = "proyectos")
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long proyecto_id;
    
    private String titulo;
    private String fecha_inicio;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    private String link;
    private String mascara;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_usuario_id")
    private Usuario usuario;

    public Proyecto() {
    }

    public Proyecto(Long proyecto_id, String titulo, String fecha_inicio, String descripcion, String link, String mascara, Usuario usuario) {
        this.proyecto_id = proyecto_id;
        this.titulo = titulo;
        this.fecha_inicio = fecha_inicio;
        this.descripcion = descripcion;
        this.link = link;
        this.mascara = mascara;
        this.usuario = usuario;
    }
    
}
