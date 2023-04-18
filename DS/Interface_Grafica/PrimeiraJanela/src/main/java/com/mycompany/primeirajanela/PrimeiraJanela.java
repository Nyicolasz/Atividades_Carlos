/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primeirajanela;

/**
 *
 * @author Admin
 */
//importação da classe de modelagem gráfica
import javax.swing.*;
import java.awt.*;

//Criando a classe e herdando os itens do JFreme
public class PrimeiraJanela extends JFrame{
    
    //Criando o método e seus padroes
    public PrimeiraJanela(){
        
        //O super faz uma chamada implicita do JFreme (puxa)
        super("Nossa primeira janela");
       
        //obtemndo a imagem e setando o objeto
        ImageIcon icone = new ImageIcon("Cassionataca.jpg");
        setIconImage(icone.getImage());
        
        //Obtem propriedades da classe JFrame e cria a variavel de instância "tela"
        Container tela = getContentPane();
        
        //atribuindo a cor RGB a variavel de instância tela
        tela.setBackground(Color.blue);
        
        //atribuindo a cor RGB a variavel de instância tela
        //tela.setBackground(new Color(255,128,128));
        
        //set usado para determinar o tamamho da janela (dimencionar)
        setSize(300, 150);
        
        //permitindo que a janela fique visivel
        setVisible(true); 
        
        //Faz com que a janela já venha na tela toda (maxmizada)
        //setExtendedState(MAXIMIZED_BOTH);
        
        //Faz com que a janela já venha pequena (minimizada)
        setExtendedState(ICONIFIED);
        
        //Faz com que a janela não possa ser redimensionada
        //setResizable(false);
        
        //Faz com que a janela possa ser redimensionada
        setResizable(true);
        
        //Esse comando permite que a janela fique centralizada
        setLocationRelativeTo(null);
    }
    
    //Criando metodo main    
    public static void main(String args[]){
        
        //Criando o objeto app com as definicoes do método PrimeiraJanela
        PrimeiraJanela app = new PrimeiraJanela();
        
        //Atribuindo os botoes minimizar, maximizar e fechar (o fechar é o que está dentro do parentes)
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); } }
