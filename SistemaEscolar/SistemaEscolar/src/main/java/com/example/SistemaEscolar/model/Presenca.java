package com.example.SistemaEscolar.model;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_presenca")
public class Presenca {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
