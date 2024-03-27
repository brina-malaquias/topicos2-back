package br.unitins.topicos2.ano2024.dto.Produto.Resistencia;
import br.unitins.topicos2.ano2024.model.Produto.*;

public record ResistenciaResponseDTO(
    Long id, 
    Double ohms
) {
    
    public static ResistenciaResponseDTO valueOf(Resistencia resistencia) {

        return new ResistenciaResponseDTO(
            resistencia.getId(), 
            resistencia.getOhms());
    }
}
