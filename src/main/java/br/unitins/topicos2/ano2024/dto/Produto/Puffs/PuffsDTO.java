package br.unitins.topicos2.ano2024.dto.Produto.Puffs;
import jakarta.validation.constraints.NotBlank;

public record PuffsDTO(    
    @NotBlank(message = "Campo nome não pode estar vazio") 
    String quantidade
) {

}