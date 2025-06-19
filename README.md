# Projeto Java MVC com JDBC

Este projeto é um exemplo básico de aplicação Java utilizando a arquitetura MVC (Model-View-Controller) e conexão com banco de dados MySQL via JDBC.

---

## Funcionalidades

- Cadastro de usuários com nome e e-mail
- Listagem dos usuários cadastrados
- Exclusão de usuários pelo ID

---

## Tecnologias utilizadas

- Java
- JDBC (MySQL Connector)
- MySQL
- NetBeans (ou IDE de sua preferência)

---

## Configuração do Banco de Dados

1. Crie o banco de dados e tabela:

```sql
CREATE DATABASE sistema_usuarios;

USE sistema_usuarios;

CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL
);
```
---
