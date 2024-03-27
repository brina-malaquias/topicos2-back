package br.unitins.topicos2.ano2024.dto.Produto.Marca;
import jakarta.validation.constraints.NotBlank;

public record MarcaDTO(
    @NotBlank(message = "Campo nome não pode estar vazio") 
    String nome,
    String descricao,
    String nomeImagem

) {

}