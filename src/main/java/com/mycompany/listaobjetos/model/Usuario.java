/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaobjetos.model;

import java.util.UUID;

/**
 *
 * @author Yan34235846
 */
public class Usuario {
   public UUID idUser;
   public String nome;
   public String email;
   public int idade;

    public UUID getIdUser() {
        return idUser;
    }

    public void setIdUser(UUID idUser) {
        this.idUser = idUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Usuario(UUID idUser, String nome, String email, int idade) {
        this.idUser = idUser;
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idUser=" + idUser + ",\n nome=" + nome + ",\n email=" + email + ",\n idade=" + idade + '}';
    }
   
   
    
}
