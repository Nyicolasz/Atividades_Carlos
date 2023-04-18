/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio_Fixacao;

/**
 *
 * @author rayli
 */
import javax.swing.*;
import java.awt.*;

public class Exercicio_Fixacao1 extends JFrame {
    
    //Criando os objetos do tipo JLabel
    JLabel rotulo1,rotulo2,rotulo3,rotulo4, rotulo5, rotulo6;
    
    //Criando os objetos do tipo JTextField
    JTextField texto1, texto2,texto3,texto4, texto5,texto6;
    
    public Exercicio_Fixacao1(){
        super ("Fixacação");
        Container tela = getContentPane();
        setLayout(null);
        
        //Atribuindo conteúdo ao JLabel
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("CPF");
        rotulo3 = new JLabel ("Endereço");
        rotulo4 = new JLabel ("Cidade");
        rotulo5 = new JLabel ("Estado");
        rotulo6 = new JLabel ("CEP");
        
        texto1 = new JTextField(50);
        texto2 = new JTextField(11);
        texto3 = new JTextField(10);
        texto4 = new JTextField(10);
        texto5 = new JTextField(10);
        texto6 = new JTextField(10);
        
        
        
        //Definindo a coluna, linha, largura e altura na janela
        rotulo1.setBounds (50, 20, 80, 20);
        rotulo2.setBounds (50, 80, 80, 20);
        rotulo3.setBounds (50, 100, 80, 20);
        rotulo4.setBounds (50, 230, 80, 20);
        rotulo5.setBounds (50, 280, 80, 20);
        rotulo6.setBounds (50, 230, 80, 20);
        
        texto1.setBounds (50, 45, 200, 20);
        texto2.setBounds (50, 110, 25, 20);
        texto3.setBounds (50, 170, 80, 20);
        texto4.setBounds (50, 250, 80, 20);
        texto5.setBounds (50, 300, 80, 20);
        texto6.setBounds (50, 350, 80, 20);
        
        //Atribundo os objetos para a tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        tela.add(rotulo5);
        tela.add(rotulo6);
        tela.add(texto1);
        tela.add(texto2);
        tela.add(texto3);
        tela.add(texto4);
        tela.add(texto5);
        tela.add(texto6);
        
        setSize(1000, 1000);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main (String args []){
        Exercicio_Fixacao1 app = new Exercicio_Fixacao1();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
