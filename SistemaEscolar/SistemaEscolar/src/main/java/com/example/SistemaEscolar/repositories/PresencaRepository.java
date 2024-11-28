package com.example.SistemaEscolar.repositories;

import com.example.SistemaEscolar.model.Presenca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PresencaRepository extends JpaRepository<Presenca, Long> {
}
