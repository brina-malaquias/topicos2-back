package br.unitins.topicos2.ano2024.model.Produto;
import br.unitins.topicos2.ano2024.model.Prof.DefaultEntity;
import jakarta.persistence.*;

public class Cor extends DefaultEntity {
    
    @Column(nullable = false, length = 60)
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
