package br.unitins.topicos2.ano2024.dto.Usuario;
import br.unitins.topicos2.ano2024.model.Usuario.*;
import java.util.List;
import java.util.Optional;

public record UsuarioResponseDTO(
    Long id,
    String nome,
    String idade,
    String email,
    String senha,
    String cpf,
    TipoUsuario tipoUsuario,
    List<TelefoneDTO> listaTelefone
) {

    public static UsuarioResponseDTO valueOf(Usuario usuario){

        return new UsuarioResponseDTO(
            usuario.getId(), 
            usuario.getNome(),
            usuario.getIdade(),
            usuario.getEmail(),
            usuario.getSenha(),
            usuario.getCpf(),
            usuario.getTipoUsuario(),
            Optional.ofNullable(usuario.getListaTelefone())
                        .map(telefones -> telefones.stream().map(TelefoneDTO::valueOf).toList())
                        .orElse(null)
        );
    }
}
