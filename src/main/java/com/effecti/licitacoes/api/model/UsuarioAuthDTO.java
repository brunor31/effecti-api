package com.effecti.licitacoes.api.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;

public record UsuarioAuthDTO(@NotEmpty(message = "E-mail é obrigatório")
                             @Schema(example = "bruno@gmail.com")
                             String email,
                             @NotEmpty(message = "Senha é obrigatório")
                             @Schema(example = "bruno123")
                             String senha) {
}
