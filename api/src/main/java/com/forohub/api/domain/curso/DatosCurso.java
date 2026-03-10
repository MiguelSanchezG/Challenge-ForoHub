package com.forohub.api.domain.curso;

import jakarta.validation.constraints.NotBlank;

public record DatosCurso(
        @NotBlank String materia) {
    public DatosCurso(Curso curso) {
        this(curso.getMateria());
    }
}
