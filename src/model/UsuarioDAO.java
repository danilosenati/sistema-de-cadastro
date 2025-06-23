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
    
    // METODO PARA ADICIONAR USUARIO NA TABELA:
    
    public void adicionarUsuario(Usuario usuario) throws SQLException{
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        
        //PREPARED STATEMENT PARA INSERCAO DE DADOS:
        PreparedStatement stm = conexao.prepareStatement(sql);
        
        // SETANDO OS VALORES:
        stm.setString(1, usuario.getNome());
        stm.setString(2, usuario.getEmail());
        
        // EXECUTANDO:
        stm.execute();
        stm.close();
    }
    
    // LISTANDO OS REGISTROS DA TABELA USUARIOS:
    
    public List<Usuario> getListaUsuarios() throws SQLException{
    String sql = "SELECT * FROM usuarios";
    
    PreparedStatement stm = conexao.prepareStatement(sql);
    ResultSet rs = stm.executeQuery();
     List<Usuario> usuarios = new ArrayList<Usuario>();
    while (rs.next()){
        
        //CRIANDO O OBJETO USUARIO:
        
        Usuario usuario = new Usuario();
        usuario.setIdUsuario(rs.getInt("idUsuario"));
        usuario.setNome(rs.getString("nome"));
        usuario.setEmail(rs.getString("email"));
        
        // ADICIONANDO O OBJETO A LISTA:
        usuarios.add(usuario);
       }
        rs.close();
        stm.close();
        return usuarios;
    
    }
    
    // MODIFICANDO OS REGISTRO DA TABELA:
    
    public void ModificarUsuario(Usuario usuario) throws SQLException{
        String sql = "UPDATE usuarios SET nome=?, email=? WHERE idUsuario=?";
        
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setString(1, usuario.getNome());
        stm.setString(2, usuario.getEmail());
        stm.setInt(3, usuario.getIdUsuario());
        stm.execute();
        stm.close();
        
    }
    
    // REMOVENDO USUARIO PELO ID:
    
    public void removerUsuario(int idUsuario) throws SQLException{
        String sql = "DELETE FROM usuarios WHERE idUsuario=?";
        
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, idUsuario);
        stm.executeUpdate();
        stm.execute();
        stm.close();
    }
    
    /*
    public void removerUsuario(Usuario usuario) throws SQLException{
        String sql = "DELETE FROM usuarios WHERE idUsuario=?";
        
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.setInt(1, usuario.getIdUsuario());
        stm.executeUpdate();
        stm.execute();
        stm.close();    
    }
    */
    
    // APAGANDO TODOS OS DADOS DA TABELA:
    
    public void limparTabela() throws SQLException{
//        Connection conexao = ConnectionFactory.criarConexao();
        String sql = "TRUNCATE TABLE usuarios";   
        PreparedStatement stm = conexao.prepareStatement(sql);
        stm.executeUpdate();
        stm.execute();
        stm.close();
        
    }
    
}