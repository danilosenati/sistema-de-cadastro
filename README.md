# Projeto Java MVC com JDBC

Este é um projeto em Java desenvolvido utilizando JDBC e arquitetura MVC. O sistema permite realizar operações de CRUD (Create, Read, Update, Delete) sobre usuários em um banco de dados MariaDB.

---

## Funcionalidades

- ✅ Adicionar usuário
- ✅ Listar usuários
- ✅ Atualizar dados do usuário
- ✅ Remover usuário
- ✅ Limpar a tabela de usuários

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
    idUsuario INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(50) NOT NULL,
    email VARCHAR(80) NOT NULL
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
