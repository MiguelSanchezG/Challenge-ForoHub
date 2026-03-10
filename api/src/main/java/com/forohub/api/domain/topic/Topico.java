package com.forohub.api.domain.topic;


import com.forohub.api.domain.curso.Curso;
import com.forohub.api.domain.usuario.Usuario;
import jakarta.persistence.*;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Table(name = "topicos")
@Entity(name = "Topico")
public class Topico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fechaCreacion;
    @Enumerated(EnumType.STRING)
    private Status status = Status.ABIERTO ;
    @Embedded
    private Usuario usuario;
    @Embedded
    private Curso curso;

    public Topico(DatosTopico datos) {
        this.id = null;
        this.titulo = datos.titulo();
        this.mensaje = datos.mensaje();
        this.usuario = new Usuario(datos.usuario());
        this.curso = new Curso(datos.curso());
        this.fechaCreacion = LocalDateTime.now();
        this.status = Status.ABIERTO;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Status getStatus() {
        return status;
    }

    public Curso getCurso() {
        return curso;
    }

    public void actualizarInformacion(@Valid DatosActualizacionTopic datos) {
        if(datos.titulo()!=null){
            this.titulo = datos.titulo();
        }
        if(datos.mensaje()!=null){
            this.mensaje = datos.mensaje();
        }
        if(datos.usuario()!=null){
            this.usuario.actualizarUsuario(datos.usuario());
        }
        if(datos.curso()!=null){
            this.curso.actualizarUsuario(datos.curso());
        }
        this.status = Status.PENDIENTE;
    }
}
