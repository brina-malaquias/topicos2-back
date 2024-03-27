package br.unitins.topicos2.ano2024.dto.Produto.Cor;
import jakarta.validation.constraints.NotBlank;

public record CorDTO(
    @NotBlank(message = "Campo nome não pode estar vazio") 
    String cor
) {

}