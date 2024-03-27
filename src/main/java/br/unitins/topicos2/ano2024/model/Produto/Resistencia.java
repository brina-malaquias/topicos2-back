package br.unitins.topicos2.ano2024.model.Produto;
import br.unitins.topicos2.ano2024.model.Prof.DefaultEntity;
import jakarta.persistence.*;

public class Resistencia extends DefaultEntity {
    
    @Column(nullable = false, length = 10)
    private Double ohms;

    public Double getOhms() {
        return ohms;
    }

    public void setOhms(Double ohms) {
        this.ohms = ohms;
    }
    
}
