package br.unitins.topicos2.ano2024.model.Usuario;
import br.unitins.topicos2.ano2024.model.Prof.DefaultEntity;
import jakarta.persistence.*;

@Entity

public class Telefone extends DefaultEntity {
    private String codigoArea;
    private String numero;

    public String getCodigoArea() {
        return codigoArea;
    }

    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}