package com.forohub.api.domain.topic;

import com.forohub.api.domain.curso.DatosCurso;
import com.forohub.api.domain.usuario.DatosUsuario;
import com.forohub.api.domain.usuario.Usuario;

import java.time.LocalDateTime;

public record DatosListaTopico(
        String titulo,
        String mensaje,
        LocalDateTime fechaCreacion,
        Status status,
        DatosUsuario usuario,
        DatosCurso curso
) {
    public DatosListaTopico(Topico topico) {
        this(topico.getTitulo(),topico.getMensaje(),topico.getFechaCreacion(),topico.getStatus(),new DatosUsuario(topico.getUsuario()),new DatosCurso(topico.getCurso()));
    }
}
