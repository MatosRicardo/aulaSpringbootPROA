package com.example.SistemaEscolar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "tb_sala")
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "pk_id_sala")
    private long id;

    @Column(name = "nome_sala")
    private String nomeSala;

    @Column(name = "capacidade_sala")
    private int capacidadeSala;

    @OneToMany(mappedBy = "sala")
    @JsonIgnore
    private List<Aluno> alunos;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeSala() {
        return nomeSala;
    }

    public void setNomeSala(String nomeSala) {
        this.nomeSala = nomeSala;
    }

    public int getCapacidadeSala() {
        return capacidadeSala;
    }

    public void setCapacidadeSala(int capacidadeSala) {
        this.capacidadeSala = capacidadeSala;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
