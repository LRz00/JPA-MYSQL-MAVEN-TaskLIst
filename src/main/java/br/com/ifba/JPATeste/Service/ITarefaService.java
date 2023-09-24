/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.JPATeste.Service;

import br.com.ifba.JPATeste.Models.Tarefas;
import java.util.List;

/**
 *
 * @author lara
 */
public interface ITarefaService {//metodos
    public List <Tarefas> ReadAllTasks();
    public Tarefas getById(long id);
    public void addTarefa(Tarefas t);
    public void updTarefa(Tarefas t);
    public void deleteTarefa(Long id);
}
