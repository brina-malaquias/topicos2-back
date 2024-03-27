package br.unitins.topicos2.ano2024.model.Produto;
import br.unitins.topicos2.ano2024.model.DefaultEntity;
import jakarta.persistence.*;

public class NicSalt extends DefaultEntity {
    private Long id;

    private String nome;
    private Double valor;
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "nicSalt-sabor", joinColumns = @JoinColumn(name = "id_nicSalt"),inverseJoinColumns = @JoinColumn(name = "id_sabor"))
    private Sabor sabor;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "nicSalt-marca", joinColumns = @JoinColumn(name = "id_nicSalt"),inverseJoinColumns = @JoinColumn(name = "id_marca"))
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

    public Sabor getSabor() {
        return sabor;
    }

    public void setSabor(Sabor sabor) {
        this.sabor = sabor;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }



}
