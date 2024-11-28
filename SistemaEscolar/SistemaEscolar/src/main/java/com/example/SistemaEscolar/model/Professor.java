package com.example.SistemaEscolar.model;


import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_professor")

public class Professor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "pk_id_professor")
    private long id;

    @Column(name = "nome_professor")
    private String nomeProfessor;

    @Column(name = "email_professor")
    private String emailProfessor;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getEmailProfessor() {
        return emailProfessor;
    }

    public void setEmailProfessor(String emailProfessor) {
        this.emailProfessor = emailProfessor;
    }
}
