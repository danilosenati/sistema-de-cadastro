/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author estudo
 */
public class Usuario {
    private int idUsuario;
    private String nome;
    private String email;
    
    
    // METODOS GETTERS E SETTERS DA CLASSE USUARIO:
    
    public int getIdUsuario(){
        return this.idUsuario;
    }
    
    public void setIdUsuario(int id_Usuario){
        this.idUsuario = id_Usuario;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
       
}