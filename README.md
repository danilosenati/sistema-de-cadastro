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
2. Configure os dados de conexão na classe ConnectionFactory.java:
   ```java
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_usuarios";
    private static final String USER = "seu_usuario";
    private static final String PASSWORD = "sua_senha";
   ```
---
Como rodar:
1. Clone o repositório

2. Importe o projeto no NetBeans

3. Configure o driver JDBC MySQL

4. Crie a classe ConnectionFactory com as configurações do seu banco

5. Execute a classe principal App.java
