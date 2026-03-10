/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listaobjetos.model;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author Yan34235846
 */
public class CreateFolder {
    
    
    public CreateFolder(){
    
     File pasta =new File("pasta_salvamentos");
  if(!pasta.exists()){
  pasta.mkdirs();
  }
  
  createFileSaves(pasta);
    }
    
    
    
    
    
    private void createFileSaves(File folder ){
        try {
            File file =new File(folder,"saves.json");
            if(!file.exists())file.createNewFile();
            
            
            
            
        } catch (IOException e) {
        e.printStackTrace();
        }
    
    }
    
}
