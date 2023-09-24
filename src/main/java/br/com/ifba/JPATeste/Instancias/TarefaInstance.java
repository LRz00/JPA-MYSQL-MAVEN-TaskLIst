/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.JPATeste.Instancias;

import br.com.ifba.JPATeste.Models.Tarefas;

/**
 *
 * @author lara
 */
public class TarefaInstance {
    /**
     * originalmente esse codigo criava apenas uma instancia que era retornada sempre q chamada
     * mas houve problemas quando eu tentava adicionar dois objetos em apenas um run time
     */
    private TarefaInstance() {
    }

    public static Tarefas createInstance() {
        return new Tarefas();
    }
    
}
