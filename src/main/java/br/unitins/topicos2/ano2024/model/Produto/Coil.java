package br.unitins.topicos2.ano2024.model.Produto;
import br.unitins.topicos2.ano2024.model.DefaultEntity;
import jakarta.persistence.*;

public class Coil extends DefaultEntity {
    private Long id;

    private String nome;
    private Double valor;
    private String descricao;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "coil-resistencia", joinColumns = @JoinColumn(name = "id_coil"),inverseJoinColumns = @JoinColumn(name = "id_resistencia"))
    private Resistencia resistencia;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinTable(name = "coil-marca", joinColumns = @JoinColumn(name = "id_coil"),inverseJoinColumns = @JoinColumn(name = "id_marca"))
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
    
    public Resistencia getResistencia() {
        return resistencia;
    }

    public void setResistencia(Resistencia resistencia) {
        this.resistencia = resistencia;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }




}
