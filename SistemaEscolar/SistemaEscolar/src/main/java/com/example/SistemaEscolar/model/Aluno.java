package com.example.SistemaEscolar.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import java.util.Date;
@Entity   //Anotações
@Table (name = "tb_aluno")


public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "pk_id_aluno")
    private long id;

    @Column(name = "nome_aluno")
    private String nome;
    @Column(name = "email_aluno")
    private String email;
    @Column(name = "data_nascimento_aluno")
    private Date dataNascimento;

    @ManyToOne
    @JoinColumn(name = "sala_id", nullable = false)
    @JsonBackReference ("salaReference")
    private Sala sala;

    @ManyToOne
    @JoinColumn(name = "professor_id", referencedColumnName = "pk_id_professor", nullable = false)
    @JsonBackReference ("professorReference")
    private Professor professor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
}
