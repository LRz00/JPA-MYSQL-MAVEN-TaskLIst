/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.JPATeste.Service;

import br.com.ifba.JPATeste.ExceptionHandler.TarefaExceptions;
import br.com.ifba.JPATeste.DAO.TarefasDao;
import br.com.ifba.JPATeste.Models.Tarefas;
import java.util.List;
import br.com.ifba.JPATeste.Instancias.TarefaDaoInstance;

/**
 *
 * @author lara
 */
public class TarefaService implements ITarefaService {
//lista de mensagens p excessão
    public final static String TAREFA_NULL = "TAREFA VAZIA";
    public final static String NOME_NULL = "CAMPO DESCRIÇÃO VAZIO VAZIO";
    public final static String TAREFA_NAO_EXISTE = "TAREFA NÂO EXISTE";

    private TarefasDao dao = TarefaDaoInstance.getInstance();//instancia o dao
//metodos:
    @Override
    public List<Tarefas> ReadAllTasks() {
        return dao.readAll();
    }

    @Override
    public Tarefas getById(long id) {
        return dao.read(id);
    }

    @Override
    public void addTarefa(Tarefas t) {
        if (t == null) {
            throw new TarefaExceptions(TAREFA_NULL);
        } else if (t.getDescricao() == null) {
            throw new TarefaExceptions(NOME_NULL);
        } else {
            dao.create(t);
        }
    }

    @Override
    public void updTarefa(Tarefas t) {
        if (t == null) {
            throw new TarefaExceptions(TAREFA_NULL);
        } else if (t.getDescricao() == null) {
            throw new TarefaExceptions(NOME_NULL);
        } else {
            dao.update(t);
        }

    }

    @Override
    public void deleteTarefa(Long id) {
        Tarefas existingTarefa = dao.read(id);
        if (existingTarefa == null) {
            throw new TarefaExceptions(TAREFA_NAO_EXISTE);
        }
        dao.delete(id);
    }
}
