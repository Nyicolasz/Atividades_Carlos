/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicios_03;

/**
 *
 * @author Nycolas
 */
import javax.swing.*;
import java.awt.*;
        
public class Questao_1 extends JFrame {
    public Questao_1(){
       
        super ("Programação Orientada a Objeto");
        
         
        setVisible(true);
        setResizable(false);
        
        setSize(450, 250);
        
        setLocationRelativeTo(null);
        
    }
    
    public static void main (String args[]){
        
        Questao_1 Janela = new Questao_1();
        
        Janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
