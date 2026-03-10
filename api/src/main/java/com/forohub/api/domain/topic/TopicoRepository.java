package com.forohub.api.domain.topic;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository <Topico, Long> {
    boolean existsByTituloAndMensaje(String titulo, String mensaje);
}
