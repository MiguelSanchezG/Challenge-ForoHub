package com.forohub.api.domain.topic;

import com.forohub.api.domain.curso.DatosCurso;
import com.forohub.api.domain.usuario.DatosUsuario;
import jakarta.validation.constraints.NotNull;

public record DatosActualizacionTopic(
        @NotNull Long id,
        String titulo,
        String mensaje,
        DatosUsuario usuario,
        DatosCurso curso
) {
}
