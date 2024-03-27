package br.unitins.topicos2.ano2024.model.Produto;
import br.unitins.topicos2.ano2024.model.Prof.DefaultEntity;
import jakarta.persistence.*;

public class Puffs extends DefaultEntity {
    
    @Column(nullable = false, length = 10)
    private String quantidade;

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }
    
}
