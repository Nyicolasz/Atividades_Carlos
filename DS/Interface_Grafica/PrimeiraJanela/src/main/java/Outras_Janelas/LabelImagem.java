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

public class LabelImagem extends JFrame  {
    JLabel imagem;
    
    //Criando os objetos do tipo JLabel
    JLabel rotulo1,rotulo2,rotulo3,rotulo4;
    
    public LabelImagem(){
        super ("Uso da classe JLabel com imagem");
        Container tela = getContentPane();

        ImageIcon icone = new ImageIcon("logo_java.png");
        imagem = new JLabel (icone);
        
        tela.add(imagem);
        setSize(500, 460);
        
        setVisible(true);
    }
    
    public static void main (String args []){
        LabelImagem app = new LabelImagem();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}