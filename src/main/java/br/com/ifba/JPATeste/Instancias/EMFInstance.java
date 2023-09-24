/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.JPATeste.Instancias;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lara
 */
public class EMFInstance {
    private static EntityManagerFactory emf;
    
    private EMFInstance(){
        
    }
    
    public static synchronized EntityManagerFactory getInstance(){
        if(emf == null){
            emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        }
        return emf;
    } 
    
}
