package br.unitins.topicos2.ano2024.model.Produto;
import br.unitins.topicos2.ano2024.model.Prof.DefaultEntity;
import jakarta.persistence.*;

public class Sabor extends DefaultEntity {
    
    @Column(nullable = false, length = 60)
    private String sabor;

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

}
