package br.unitins.topicos2.ano2024.dto.Produto.Marca;
import br.unitins.topicos2.ano2024.model.Produto.*;

public record MarcaResponseDTO(
    Long id, 
    String nome,
    String descricao,
    String nomeImagem
) {
    
    public static MarcaResponseDTO valueOf(Marca marca) {

        return new MarcaResponseDTO(
            marca.getId(), 
            marca.getNome(),
            marca.getDescricao(),
            marca.getNomeImagem());
    }
}