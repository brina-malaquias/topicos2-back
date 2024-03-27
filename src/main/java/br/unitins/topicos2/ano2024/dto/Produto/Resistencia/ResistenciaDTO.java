package br.unitins.topicos2.ano2024.dto.Produto.Resistencia;
import jakarta.validation.constraints.NotBlank;

public record ResistenciaDTO(
    @NotBlank(message = "Campo nome não pode estar vazio") 
    Double ohms
) {

}