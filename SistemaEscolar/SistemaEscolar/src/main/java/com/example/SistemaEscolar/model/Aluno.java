package com.example.SistemaEscolar.model;

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
    private Professor professor;

    @ManyToOne
    private Sala sala;

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
}
