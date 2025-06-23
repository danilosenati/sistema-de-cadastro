/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author estudo
 */

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    
    private Connection conexao;
    
    // CONSTRUTOR ABRE UMA CONEXAO COM O BANCO DE DADOS
    
    public UsuarioDAO() throws SQLException{
        this.conexao = ConnectionFactory.criarConexao();
        
    }
    
    public void adicionaUsuario(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        
        //PREPARED STATEMENT PARA INSERCAO DE DADOS:
        PreparedStatement stm = conexao.prepareStatement(sql);
        
        
    
    }
    
    
    
}
