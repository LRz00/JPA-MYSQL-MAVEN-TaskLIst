/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.JPATeste.Facade;

import br.com.ifba.JPATeste.Service.TarefaService;
import br.com.ifba.JPATeste.Service.ITarefaService;
import br.com.ifba.JPATeste.Models.Tarefas;
import java.util.List;

/**
 
 * @author lara
 */
public class TarefasFachadas implements ITarefasFachadas{
    private ITarefaService tarefaService;//cria intancia do serviço
    
    public TarefasFachadas(){
        this.tarefaService = new TarefaService();
    }
    //metodso da interface
    @Override
    public void addTarefa(Tarefas t){
       tarefaService.addTarefa(t);
    }
    
    @Override
    public List<Tarefas> readAll(){
        return tarefaService.ReadAllTasks();
    }
    
    @Override
    public Tarefas read(long id){
        return tarefaService.getById(id);
    }
    @Override
    public void update(Tarefas t){
        tarefaService.updTarefa(t);
    }
    
    @Override
    public void delete(long id){
        tarefaService.deleteTarefa(id);
    }
    
}
