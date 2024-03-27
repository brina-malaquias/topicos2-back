package br.unitins.topicos2.ano2024.dto.Produto.Cor;
import br.unitins.topicos2.ano2024.model.Produto.*;

public record CorResponseDTO(
    Long id, 
    String cor
) {
    
    public static CorResponseDTO valueOf(Cor cor) {

        return new CorResponseDTO(
            cor.getId(), 
            cor.getCor());
    }
}