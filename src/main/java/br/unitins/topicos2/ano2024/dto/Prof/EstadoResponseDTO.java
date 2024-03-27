package br.unitins.topicos2.ano2024.dto.Prof;

import br.unitins.topicos2.ano2024.model.Prof.Estado;

public record EstadoResponseDTO (
    Long id,
    String nome,
    String sigla
) {

    public static EstadoResponseDTO valueOf(Estado estado) {
        return new EstadoResponseDTO(
            estado.getId(), 
            estado.getNome(),
            estado.getSigla()
        );
    }

}