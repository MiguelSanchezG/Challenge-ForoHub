package com.forohub.api.domain.usuario;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Usuario {
    private String nombre;
    private String email;

    public Usuario(DatosUsuario datosUsuario) {
        this.nombre = datosUsuario.nombre();
        this.email = datosUsuario.email();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void actualizarUsuario(DatosUsuario usuario) {
        if(usuario.nombre()!=null){
            this.nombre = usuario.nombre();
        }
        if(usuario.email()!=null){
            this.email = usuario.email();
        }
    }
}
