/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Outras_Janelas;

/**
 *
 * @author rayli
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
    

public class ExemploBotoes extends JFrame {
    
    //Criando os objetos do tipo JButton
    JButton botao1, Botao2, Botao3, Botao4;
    ImageIcon icone;
    
    public ExemploBotoes(){
        super ("Exemplo com JButton");
        Container tela = getContentPane();
        setLayout(null);
        
        //Atribuindo conteúdo ao JLabel
        
        botao1 = new JButton ("Procurar");
       
        Botao2 = new JButton ("Voltar >>");
        
        Botao3 = new JButton ("Próximo >>");
        
        Botao4 = new JButton ("Abrir");
        
        //Definindo a coluna, linha, largura e altura na janela
        botao1.setBounds (50, 20, 100, 20);
        Botao2.setBounds (50, 80, 100, 20);
        Botao3.setBounds (50, 140, 100, 20);
        Botao4.setBounds (50, 200, 100, 20);
        
        //Colocando cor nos botoes
        
        /*botao1.setBackground (Color.YELLOW);
        Botao2.setBackground (Color.RED);
        Botao3.setBackground (Color.BLUE);
        Botao4.setBackground (Color.WHITE);*/
        
        //Marcar uma letra
        botao1.setMnemonic(KeyEvent.VK_P);
        Botao2.setMnemonic(KeyEvent.VK_V);
        Botao3.setMnemonic(KeyEvent.VK_X);
        Botao4.setMnemonic(KeyEvent.VK_S);
        
        //Definindo a ação do botão quando aperta enter
        getRootPane().setDefaultButton(botao1);
        
        //Mudando a cor da fonte dos botoes
        botao1.setForeground(Color.blue);
        Botao2.setForeground(Color.green);
        Botao3.setForeground(Color.red);
        Botao4.setForeground(Color.pink);
        
        //Atribundo os objetos para a tela
        tela.add(botao1); 
        tela.add(Botao2);
        tela.add(Botao3);
        tela.add(Botao4);
        
        setSize(400, 350);
        setVisible(true);
        
    }
    
    public static void main (String args []){
        ExemploBotoes app = new ExemploBotoes();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
