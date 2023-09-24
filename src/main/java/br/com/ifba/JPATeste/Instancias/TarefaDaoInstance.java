/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.JPATeste.Instancias;
import br.com.ifba.JPATeste.DAO.TarefasDao;
import br.com.ifba.JPATeste.DAO.ITarefasDao;

/**
 *
 * @author lara
 */
public class TarefaDaoInstance {
    private static ITarefasDao tarefasDao;
    
    private TarefaDaoInstance(){
        tarefasDao = new TarefasDao();
    }
    
    public static TarefasDao getInstance(){
        if(tarefasDao == null){
            tarefasDao = new TarefasDao();
        }
        return (TarefasDao) tarefasDao;
    }
}
