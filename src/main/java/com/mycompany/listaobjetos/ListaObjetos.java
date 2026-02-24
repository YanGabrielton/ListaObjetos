/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaobjetos;

import com.mycompany.listaobjetos.model.Usuario;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Yan34235846
 */
public class ListaObjetos {

    public static void main(String[] args) {
       
        
        Scanner input= new Scanner(System.in);
        List<Usuario>usuarios = new ArrayList<>();
        
        UUID token=UUID.randomUUID();
        System.out.println("Digite nome;");
        String nome= input.next();
        
        System.out.println("Digite email;");
        String email= input.next();
        
        System.out.println("Digite idade;");
        int idade= input.nextInt();
        
       Usuario u=new Usuario(token,nome,email,idade);
       usuarios.add(u);
        
        for(int i=0;i< usuarios.size();i++){
        
            System.out.println("Token: "+u.getIdUser()+"\n nome: "+u.getNome()+
                    "\n email: "+u.getEmail()+
                    "\n idade:  "+u.getIdade());
        
        }
        
    }
}
