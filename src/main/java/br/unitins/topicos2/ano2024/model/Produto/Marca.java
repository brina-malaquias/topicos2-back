package br.unitins.topicos2.ano2024.model.Produto;
import br.unitins.topicos2.ano2024.model.DefaultEntity;
import jakarta.persistence.*;

public class Marca extends DefaultEntity {
    
    @Column(nullable = false, length = 60)
    private String nome;

    private String descricao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
}
