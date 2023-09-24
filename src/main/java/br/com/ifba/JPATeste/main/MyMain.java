/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.JPATeste.main;

import br.com.ifba.JPATeste.view.Tela1;

/**
 *
 * @author lara
 */
public class MyMain {
    public static void main(String[] args) {
        // Create and show the main frame (Tela1)
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Tela1 tela1 = new Tela1();
                tela1.setVisible(true);
            }
        });
    }
}
