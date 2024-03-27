package br.unitins.topicos2.ano2024.model.Produto;
import br.unitins.topicos2.ano2024.model.DefaultEntity;
import jakarta.persistence.*;

public class PodDescartavel extends DefaultEntity {
    private Long id;

    private String nome;
    private Double valor;
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "descartavel-sabor", joinColumns = @JoinColumn(name = "id_podDescartavel"),inverseJoinColumns = @JoinColumn(name = "id_sabor"))
    private Sabor sabor;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "descartavel-puffs", joinColumns = @JoinColumn(name = "id_podDescartavel"),inverseJoinColumns = @JoinColumn(name = "id_puffs"))
    private Puffs puffs;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "descartavel-marca", joinColumns = @JoinColumn(name = "id_podDescartavel"),inverseJoinColumns = @JoinColumn(name = "id_marca"))
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

    public Puffs getPuffs() {
        return puffs;
    }

    public void setPuffs(Puffs puffs) {
        this.puffs = puffs;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }



}
