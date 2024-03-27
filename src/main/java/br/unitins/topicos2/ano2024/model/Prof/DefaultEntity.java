package br.unitins.topicos2.ano2024.model.Prof;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class DefaultEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}