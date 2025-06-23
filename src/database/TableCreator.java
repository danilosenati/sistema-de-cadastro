/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

/**
 * @author estudo
 * 
 * No desenvolvimento Java com JDBC, a criação das tabelas do banco geralmente não faz parte do código Java em ambientes profissionais
 * isso é feito separadamente, via scripts SQL, migrations ou diretamente no banco.

   Porém, para projetos pequenos, testes, ou aplicações que precisam se autoinicializar, você pode sim criar uma classe em Java que execute
   os comandos SQL para criar as tabelas.
 */

// CRIAND AS TABELAS

import conexao.ConnectionFactory;
import java.sql.Connection;
import java .sql.Statement;

public class TableCreator {
    public static void main(String [] args){
        try(Connection connection = ConnectionFactory.criarConexao();
            Statement stm = connection.createStatement()) {
            
            // CRIANDO A TABELA USUARIOS:
            String sql =
                    """
                        CREATE TABLE IF NOT EXISTS usuarios(
                        idUsuario INT AUTO_INCREMENT PRIMARY KEY,
                        nome varchar(50) NOT NULL,
                        email varchar(80) NOT NULL);
                    """;
            stm.execute(sql);
            
            System.out.println("Tabela criada com sucesso!");
            
        }catch(Exception e){
            System.out.println("Erro ao criar tabela: "+ e.getMessage());
        }
    
    }
    
}