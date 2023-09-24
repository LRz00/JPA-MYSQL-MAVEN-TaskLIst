/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.JPATeste.Facade;

import br.com.ifba.JPATeste.Models.Tarefas;
import java.util.List;

/**
 *
 * @author lara
 */
public interface ITarefasFachadas {//metodos:
     public void addTarefa(Tarefas t);
      public List<Tarefas> readAll();
      public Tarefas read(long id);
      public void update(Tarefas t);
      public void delete(long id);
}
