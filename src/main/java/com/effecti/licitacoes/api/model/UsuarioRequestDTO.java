package com.effecti.licitacoes.api.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class UsuarioRequestDTO {

    @NotEmpty
    @Schema(description = "Nome do Usuário", example = "Bruno")
    private String nome;
    @NotEmpty
    @Schema(description = "E-mail do Usuário", example = "bruno@gmail.com")
    private String email;
    @NotEmpty
    @Schema(description = "Senha do Usuário", example = "bruno123")
    private String senha;
}
