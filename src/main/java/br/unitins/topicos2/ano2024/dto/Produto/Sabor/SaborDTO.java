package br.unitins.topicos2.ano2024.dto.Produto.Sabor;

import jakarta.validation.constraints.NotBlank;

public record SaborDTO(
    @NotBlank(message = "Campo nome não pode estar vazio") 
    String sabor
) {

}
