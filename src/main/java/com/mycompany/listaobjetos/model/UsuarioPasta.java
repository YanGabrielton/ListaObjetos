/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaobjetos.model;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileWriter;
import com.mycompany.listaobjetos.model.Usuario;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Yan34235846
 */
public class UsuarioPasta {
    Gson gson=new Gson();
    
   
   public void SalvarUsuarios(Usuario usuario) throws IOException{
   
        
    //Criar Pasta
    File pasta =new File("dados");
  if(!pasta.exists()){
  pasta.mkdir();
      System.out.println("pasta criada com sucesso: "+pasta);
  }
  String nomeArquivo= "dados/"+usuario.getIdUser()+".json";
//aqui eu estou criando os arquivos dentro da pasta criada logo acima
FileWriter writer = new FileWriter(nomeArquivo);
    gson.toJson(usuario,writer);
    writer.close();
      System.out.println("Arquivo salvo com sucesso!");

   
   }

}
