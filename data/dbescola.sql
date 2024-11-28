create database dbescola;
use dbescola;


CREATE TABLE tb_aluno (
    pk_id_aluno BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_aluno VARCHAR(100) NOT NULL,
    email_aluno VARCHAR(100),
    data_nascimento_aluno DATE,
    sala_id BIGINT NOT NULL, -- Associação com sala
    professor_id BIGINT NOT NULL -- Associação com professor
);

CREATE TABLE tb_professor (
    pk_id_professor BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_professor VARCHAR(100) NOT NULL,
    email_professor VARCHAR(100)
);

CREATE TABLE tb_sala (
    pk_id_sala BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome_sala VARCHAR(50) NOT NULL,
    capacidade INT NOT NULL
);

CREATE TABLE tb_presenca (
    pk_id_presenca BIGINT AUTO_INCREMENT PRIMARY KEY,
    aluno_id BIGINT NOT NULL,
    sala_id BIGINT NOT NULL,
    professor_id BIGINT NOT NULL,
    data_presenca DATE NOT NULL
);


ALTER TABLE tb_aluno
ADD CONSTRAINT fk_aluno_sala
FOREIGN KEY (sala_id) REFERENCES tb_sala (pk_id_sala);

ALTER TABLE tb_aluno
ADD CONSTRAINT fk_aluno_professor
FOREIGN KEY (professor_id) REFERENCES tb_professor (pk_id_professor);


ALTER TABLE tb_presenca
ADD CONSTRAINT fk_presenca_aluno
FOREIGN KEY (aluno_id) REFERENCES tb_aluno (pk_id_aluno);


ALTER TABLE tb_presenca
ADD CONSTRAINT fk_presenca_sala
FOREIGN KEY (sala_id) REFERENCES tb_sala (pk_id_sala);

ALTER TABLE tb_presenca
ADD CONSTRAINT fk_presenca_professor
FOREIGN KEY (professor_id) REFERENCES tb_professor (pk_id_professor);



INSERT INTO tb_professor (nome_professor, email_professor)
VALUES 
('Carlos Silva', 'carlos.silva@escola.com'),
('Ana Oliveira', 'ana.oliveira@escola.com');



INSERT INTO tb_sala (nome_sala, capacidade)
VALUES 
('Matemática Avançada', 30),
('História Moderna', 25);

INSERT INTO tb_aluno (nome_aluno, email_aluno, data_nascimento_aluno, sala_id, professor_id)
VALUES 
('João Pedro', 'joao.pedro@escola.com', '2008-05-12', 1, 1),
('Maria Clara', 'maria.clara@escola.com', '2009-08-20', 2, 2);


INSERT INTO tb_presenca (aluno_id, sala_id, professor_id, data_presenca)
VALUES 
(1, 1, 1, '2024-11-27'),
(2, 2, 2, '2024-11-27');

