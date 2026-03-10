package com.forohub.api.domain.curso;


import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Embeddable
public class Curso {
    private String materia;

    public Curso(DatosCurso datosCurso) {
        this.materia = datosCurso.materia();
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public void actualizarUsuario(DatosCurso curso) {
        if(curso.materia()!=null){
            this.materia = curso.materia();
        }
    }
}
