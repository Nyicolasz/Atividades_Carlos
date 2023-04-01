/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nycolas
 */
//impotação
import javax.swing.JOptionPane;

//Classe Questao_4
public class Questao_4 {
    
    //pacote de extensão do núcleo de java
    public static void main (String[] args){
        
        //CHamando o metodo
        Hipotenusa();
        
    }
    
    //Criando Metodo, variaveis e fazendo a entrada de dados
    static void Hipotenusa(){
        double Hipotenusa, Base, Altura;
        
         Base = Double.parseDouble(JOptionPane.showInputDialog("Valor da base: "));
         Altura = Double.parseDouble(JOptionPane.showInputDialog("Valor da altura: "));
         
         //Fazendo o calculo
         Hipotenusa = (Base*Base) +(Altura * Altura);
         
         //Usanod uma função para fazer a raiz quadrada
         Hipotenusa = Math. sqrt(Hipotenusa);
         
         //resultado
         JOptionPane.showMessageDialog(null, "O valor d hipotenusa é: " + Hipotenusa);
    }
    }
