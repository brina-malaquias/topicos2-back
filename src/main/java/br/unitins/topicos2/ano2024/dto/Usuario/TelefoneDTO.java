package br.unitins.topicos2.ano2024.dto.Usuario;
import br.unitins.topicos2.ano2024.model.Usuario.Telefone;

public record TelefoneDTO(
    String codigoArea,
    String numero
) {
    public static TelefoneDTO valueOf(Telefone telefone){
        return new TelefoneDTO(
            telefone.getCodigoArea(), 
            telefone.getNumero()
        );
    }
}
