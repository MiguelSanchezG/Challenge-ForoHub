package com.forohub.api.domain.topic;

import com.forohub.api.domain.curso.DatosCurso;
import com.forohub.api.domain.usuario.DatosUsuario;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record DatosTopico(
        @NotBlank String titulo,
        @NotBlank @Size(max = 200) String mensaje,
        @NotNull @Valid DatosUsuario usuario,
        @NotNull @Valid DatosCurso curso
) {

}
