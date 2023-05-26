package com.portfolio.ap.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuario_id;
    
    private String apellido;
    private String nombre;
    private String titulo;
    private String foto;
    @Lob
    @Column(columnDefinition = "TEXT")
    private String descripcion;
    
    @OneToOne(fetch = FetchType.LAZY)
    private LoginUsuario loginUsuario;
    
    @OneToMany(mappedBy = "experiencia_laboral_id", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ExperienciaLaboral> experienciaLaborallist;
    
    @OneToMany(mappedBy = "estudio_id", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Estudio> estudiolist;
    
    @OneToMany(mappedBy = "skill_id", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Skill> skilllist;
    
    @OneToMany(mappedBy = "proyecto_id", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Proyecto> proyectolist;

    public Usuario() {
    }

    public Usuario(Long usuario_id, String apellido, String nombre, String titulo, String foto, String descripcion, LoginUsuario loginUsuario, List<ExperienciaLaboral> experienciaLaborallist, List<Estudio> estudiolist, List<Skill> skilllist, List<Proyecto> proyectolist) {
        this.usuario_id = usuario_id;
        this.apellido = apellido;
        this.nombre = nombre;
        this.titulo = titulo;
        this.foto = foto;
        this.descripcion = descripcion;
        this.loginUsuario = loginUsuario;
        this.experienciaLaborallist = experienciaLaborallist;
        this.estudiolist = estudiolist;
        this.skilllist = skilllist;
        this.proyectolist = proyectolist;
    }
    
}
