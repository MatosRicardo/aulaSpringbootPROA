package com.example.SistemaEscolar.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "pk_id_presenca")
    private long id;

    @Column(name = "data_presenca")
    private Date dataPresenca;

    @ManyToOne
    private Aluno aluno;

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

    public Date getDataPresenca() {
        return dataPresenca;
    }

    public void setDataPresenca(Date dataPresenca) {
        this.dataPresenca = dataPresenca;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
