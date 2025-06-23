/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package app;

/**
 *
 * @author estudo
 */

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import model.Usuario;
import model.UsuarioDAO;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException{
        
        Scanner entrada = new Scanner(System.in);
        
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        
        //ADICIONANDO NOVOs USUARIOS:
        
        Usuario personagem1 = new Usuario();
        personagem1.setNome("Madruguinha");
        personagem1.setEmail("seu-madruga@chaves.moc");
        usuarioDAO.adicionarUsuario(personagem1);
        
        Usuario personagem2 = new Usuario();
        personagem2.setNome("Dona Florinda");
        personagem2.setEmail("donaFLorinda@chaves.moc");
        usuarioDAO.adicionarUsuario(personagem2);
        
        Usuario personagem3 = new Usuario();
        personagem3.setNome("Chaves");
        personagem3.setEmail("chaves1@chaves.moc");
        
        Usuario personagem4 = new Usuario();
        personagem4.setNome("Jaiminho");
        personagem4.setEmail("jaiminho-carteiro@chaves.moc");
        
        
        // LISTANDO USUARIOS:
        
        List<Usuario>usuarios = usuarioDAO.getListaUsuarios();
        for(Usuario usuario: usuarios){
            System.out.println("Id: "+usuario.getIdUsuario()+
                    ", Nome: "+usuario.getNome()+
                    ", E-mail: "+usuario.getEmail());
        }
        
        // REMOVENDO DADO DA TABELA:
        
        usuarioDAO.removerUsuario(personagem4);
        
//        *******************************************
        
        // LIMPANDO OS CAMPOS DA TABELA:
        
        System.out.println("Deseja limpar a tabela usuarios? (S/N)");
        String resposta = entrada.nextLine();
        
        if(resposta.equalsIgnoreCase("S")){
            usuarioDAO.limparTabela(); // LIMPANDO A TABELA.
            System.out.println("Tabela limpa com sucesso!");
        }
        else{
            System.out.println("Operacao cancelada");
        }
                          
    }
    
}