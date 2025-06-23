/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexao;

/**
 *
 * @author estudo
 */
import java.sql.Connection;
import java.sql.SQLException;


// TESTANDO ABERTURA DA CONEXAO DA CLASSE Connection_Factory
public class JDBC_Aplication {
    public static void main(String[] args) throws SQLException{
        System.out.println("Abrindo conexao factory!");
        Connection conexao = ConnectionFactory.criarConexao();
        System.out.println("Conectado factory");
        conexao.close();
    }   
}