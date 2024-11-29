package com.example.SistemaEscolar.controller;


import com.example.SistemaEscolar.model.Aluno;
import com.example.SistemaEscolar.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<Aluno> getAlunos() {

        return alunoRepository.findAll();
    }

    @PostMapping
    public Aluno criarAluno(@RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    @PutMapping("/{id}")
    public Aluno atualizarNomeAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
        Aluno alunoExistente = alunoRepository.findById(id).orElse(null);
        if (alunoExistente != null && alunoExistente.getNome() != null) {
            alunoExistente.setNome(aluno.getNome());
            return alunoRepository.save(alunoExistente);
        }
        return null;
    }
    @DeleteMapping("{id}")
    public ResponseEntity<String> deletarAluno(@PathVariable Long id) {
        if (alunoRepository.existsById(id)) {
            alunoRepository.deleteById(id);
            return ResponseEntity.ok().body("Aluno deletado com sucesso");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Aluno não encontrado");
        }
    }
}
