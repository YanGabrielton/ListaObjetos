/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listaobjetos;

import com.mycompany.listaobjetos.model.Usuario;
import static com.mycompany.listaobjetos.model.Usuario.listarUsuarios;
import com.mycompany.listaobjetos.model.UsuarioPasta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

/**
 *
 * @author Yan34235846
 */
public class ListaObjetosOrdenada {

    public static void main(String[] args) throws IOException {
        
        
        
        List<Usuario>listaOriginal= Usuario.listarUsuarios();
        
        
        
        List<Usuario>listaNova= new ArrayList<>();
        
       for(Usuario user: listaOriginal){
       
           pegarUsuarios(listaOriginal, listaNova);
       
       }
       
       for (int i=0;i<listaNova.size();i++){
       Usuario user = listaNova.get(i);
       
           System.out.println("UUID: "+user.getIdUser()+
                   "\n Nome: "+user.getNome()+
                   "\n Email: "+ user.getEmail()+
                   "\n idade: "+user.getIdade());
       
       
       
       }
       
   //       UsuarioPasta pasta = new UsuarioPasta();
   // pasta.SalvarUsuarios(u);
  
       
       
       
       
       
        
    }
    
    
    
    public static Usuario pegarUsuarios(List<Usuario>listaOriginal,List<Usuario>listaNova) throws IOException{
       Usuario maior =null;
        for(Usuario user:listaOriginal){
        
        if(listaNova.contains(user))continue;
        if(maior==null || user.getIdade() >= maior.getIdade()) 
            maior=user;
        }
        
        //se o maior não for mais nullo
        if(maior != null){
        listaNova.add(maior);
        UsuarioPasta pasta = new UsuarioPasta();
    pasta.SalvarUsuarios(maior);
        
        
        }
       
       
        return maior;
       
       
       
       }
}
