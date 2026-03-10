/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.listaobjetos;

import com.google.gson.Gson;
import com.mycompany.listaobjetos.model.Usuario;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.UUID;
import javax.swing.SwingUtilities;

/**
 *
 * @author Yan34235846
 */
public class NewMain {
    
    
       public NewMain(){
    
     File pasta =new File("pasta_salvamentos");
  if(!pasta.exists()){
  pasta.mkdirs();
  }
  
           createFileSaves(pasta);
           
           Usuario usuario1 =new Usuario(UUID.randomUUID(),"Luan","luan@gmail.com", 19);
           Usuario usuario2 =new Usuario(UUID.randomUUID(),"gabirel","luan@gmail.com", 74);
           saveUsuario(pasta, usuario1);
           System.out.println("Salvou o usuario");
           saveUsuario(pasta, usuario2);
           
           Usuario user=loadUser(pasta);
           System.out.println("Usuario cadastrado: "+user.getNome());
  
    }
       
       
       private void saveUsuario(File folder,Usuario user){
         try {
            File file =new File(folder,user.idUser+"saves.json");
            if(!file.exists())file.createNewFile();
            
             FileWriter writer = new FileWriter(file);
             writer.write(new Gson().toJson(user));
             writer.flush();
             writer.close();
            
            
        } catch (IOException e) {
        e.printStackTrace();
        }
    
       
       }
       
       
       private Usuario loadUser(File folder){
       
           try {
               
               File file =new File(folder,"saves.json");
               String escrita = Files.readString(file.toPath());
               Gson gson =new Gson();
               Usuario user = gson.fromJson(escrita, Usuario.class);
               return user;
           } catch (IOException e) {
               e.printStackTrace();
           }
           return null;
       }
    
    private void createFileSaves(File folder ){
        try {
            File file =new File(folder,"saves.json");
            if(!file.exists())file.createNewFile();
            
            
            
            
        } catch (IOException e) {
        e.printStackTrace();
        }
    
    }

    public static void main(String[] args) {
       SwingUtilities.invokeLater(NewMain::new);
    
  
    }
 
    
}
