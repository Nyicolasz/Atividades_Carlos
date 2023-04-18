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

public class ExemploLabel extends JFrame {
    
    //Criando os objetos do tipo JLabel
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    
    public ExemploLabel(){
        super ("Exemplo com Label");
        Container tela = getContentPane();
        setLayout(null);
        
        //Atribuindo conteúdo ao JLabel
        rotulo1 = new JLabel ("Nome");
        rotulo2 = new JLabel ("Idade");
        rotulo3 = new JLabel ("Telefone");
        rotulo4 = new JLabel ("Celular");
        
        //Definindo a coluna, linha, largura e altura na janela
        rotulo1.setBounds (50, 20, 80, 20);
        rotulo2.setBounds (50, 60, 80, 20);
        rotulo3.setBounds (50, 100, 80, 20);
        rotulo4.setBounds (50, 140, 80, 20);
        
        //Atribuindo a cor da fonte do conteúdo
        rotulo1.setForeground(Color.red);
        rotulo2.setForeground(Color.blue);
        rotulo3.setForeground(new Color (190, 152, 142));
        rotulo4.setForeground(new Color (201, 200, 100));
        
        //Atribuindo a fonte do conteúdo
        rotulo1.setFont(new Font ("Arial", Font.BOLD, 14));
        rotulo1.setFont(new Font ("Comics Sans MS", Font.BOLD, 16));
        rotulo1.setFont(new Font ("Courier New", Font.BOLD, 18));
        rotulo1.setFont(new Font ("Times New Roman", Font.BOLD, 14));
        
        //Atribundo os objetos para a tela
        tela.add(rotulo1);
        tela.add(rotulo2);
        tela.add(rotulo3);
        tela.add(rotulo4);
        
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main (String args []){
        ExemploLabel app = new ExemploLabel();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
