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

public class ExemploJPasswordField extends JFrame {
    
    //Criando os objetos do tipo JPasswordField
    JPasswordField caixa;
    JLabel rotulo;
    
    public ExemploJPasswordField(){
        super ("Exemplo com JPasswordField");
        Container tela = getContentPane();
        setLayout(null);
        
        //Atribuindo conteúdo ao JLabel
        rotulo = new JLabel ("Senha");
        caixa = new JPasswordField(10);
        
        //mundado a caracter
        caixa.setEchoChar('*');
        
        //Definindo a coluna, linha, largura e altura na janela
        rotulo.setBounds (50, 20, 100, 20);
        caixa.setBounds (50, 60, 80, 20);
        
        //Atribundo os objetos para a tela
        tela.add(rotulo);
        tela.add(caixa);       
        
        setSize(400, 250);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    
    public static void main (String args []){
        ExemploJPasswordField app = new ExemploJPasswordField();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
