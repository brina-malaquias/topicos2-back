package br.unitins.topicos2.ano2024.model.Produto;
import br.unitins.topicos2.ano2024.model.DefaultEntity;
import jakarta.persistence.*;

public class PodRecarregavel extends DefaultEntity {

    private Long id;

    private String nome;
    private Double valor;
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "recarregavel-cor", joinColumns = @JoinColumn(name = "id_podRecarregavel"),inverseJoinColumns = @JoinColumn(name = "id_cor"))
    private Cor cor;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "recarregavel-marca", joinColumns = @JoinColumn(name = "id_podRecarregavel"),inverseJoinColumns = @JoinColumn(name = "id_marca"))
    private Marca marca;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cor getCor() {
        return cor;
    }

    public void setCor(Cor cor) {
        this.cor = cor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }



}
