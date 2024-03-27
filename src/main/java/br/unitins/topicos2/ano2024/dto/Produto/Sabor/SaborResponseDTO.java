package br.unitins.topicos2.ano2024.dto.Produto.Sabor;
import br.unitins.topicos2.ano2024.model.Produto.*;

public record SaborResponseDTO(
    Long id, 
    String sabor
) {
    
    public static SaborResponseDTO valueOf(Sabor sabor) {

        return new SaborResponseDTO(
            sabor.getId(), 
            sabor.getSabor());
    }
}