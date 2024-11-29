package com.example.SistemaEscolar.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
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
    private String capacidadeSala;

    @OneToMany(mappedBy = "sala")
    @JsonIgnore
    @JsonManagedReference("salaReference")
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

    public String getCapacidadeSala() {
        return capacidadeSala;
    }

    public void setCapacidadeSala(String capacidadeSala) {
        this.capacidadeSala = capacidadeSala;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
