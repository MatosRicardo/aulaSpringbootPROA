# Aula de Spring Boot - API com Banco de Dados

Este repositório contém o código desenvolvido durante a aula de Spring Boot ministrada pelo **Jefferson**, aluno do **PROA**. Durante a aula, aprendemos como criar uma API simples utilizando o framework Spring Boot, que se conecta a um banco de dados para armazenar e recuperar dados.

## Objetivo

O principal objetivo da aula foi ensinar como:
- Criar um projeto Spring Boot.
- Configurar o Spring Data JPA para comunicação com um banco de dados.
- Criar endpoints de uma API para manipulação de dados.
  
Ao final da aula, conseguimos criar uma API funcional que interage com um banco de dados para realizar operações como `GET`, `POST`, `PUT` e `DELETE`.

## Tecnologias Utilizadas

- **Spring Boot**: Framework Java para criação de aplicações.
- **Spring Data JPA**: Para interação com o banco de dados.
- **H2 Database**: Banco de dados em memória utilizado para este projeto.
- **Maven**: Gerenciador de dependências.

## Funcionalidades da API

A API construída permite realizar as seguintes operações:
- **GET** `/tarefas`: Recupera todas as tarefas armazenadas no banco de dados.
- **POST** `/tarefas`: Cria uma nova tarefa no banco de dados.
- **PUT** `/tarefas/{id}`: Atualiza uma tarefa existente.
- **DELETE** `/tarefas/{id}`: Remove uma tarefa do banco de dados.
