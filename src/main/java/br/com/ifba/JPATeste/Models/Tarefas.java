/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.JPATeste.Models;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * /**
 *
 * @author lara
 */
@Entity
public class Tarefas extends AbstractEntity {//extende abstractentity q tem apenas id
    //atributps

    private String descricao;
    private boolean finalizado;

    @Temporal(TemporalType.DATE)
    private Calendar dataFinal;
//construtores

    public Tarefas() {

    }

    public Tarefas(Long id, String descricao, boolean finalizado, Calendar dataFinal) {
        this.descricao = descricao;
        this.finalizado = finalizado;
        this.dataFinal = dataFinal;
    }

//metodos
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    public Calendar getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Calendar dataFinal) {
        this.dataFinal = dataFinal;
    }

}
