package com.forohub.api.domain.respuesta;

import com.forohub.api.domain.topic.Topico;
import com.forohub.api.domain.usuario.DatosUsuario;

import java.util.Date;

public class Respuesta {
    private long id;
    private String mensaje;
    private Topico topico;
    private Date fechaCreacion;
    private DatosUsuario datosUsuario;
    private String solucion;
}
