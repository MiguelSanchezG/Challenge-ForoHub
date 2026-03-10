package com.forohub.api.domain.usuario;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;

public record DatosUsuario(

        @NotBlank String nombre,
        @NotBlank String email) {
    public DatosUsuario(Usuario usuario) {
        this(usuario.getNombre(), usuario.getEmail());
    }


}
