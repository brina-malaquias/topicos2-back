package br.unitins.topicos2.ano2024.dto.Produto.Puffs;
import br.unitins.topicos2.ano2024.model.Produto.*;

public record PuffsResponseDTO(
    Long id, 
    String quantidade
) {
    
    public static PuffsResponseDTO valueOf(Puffs puffs) {

        return new PuffsResponseDTO(
            puffs.getId(), 
            puffs.getQuantidade());
    }
}