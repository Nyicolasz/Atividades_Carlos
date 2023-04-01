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

//Classe Questao_1
public class Questao_1 {
    
    //pacote de extensão do núcleo de java
    public static void main (String[] args){
        
        //Chamando metodo
        LerNota();
        
    }
    
    //Criando Metodo, variaveis e fazendo a entrada de dados
    static void LerNota(){
        double Nota1, Nota2;
        String Nome;
        
        Nome = JOptionPane.showInputDialog("Digite o nome: ");
        Nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota: "));
        Nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota: "));
        
        //chamando um metodo e passadno os parametros
        calcularMedia(Nota1, Nota2, Nome);
        
    }
    //criando metodo com parametros 
    private static void calcularMedia(double N1, double N2, String Name){
    
        //FAzendo calculo
    double Media = (N2 + N2)/2;
    
    
    //Estrutura de decisão para saber o que printar 
    if(Media >= 7){
        JOptionPane.showMessageDialog(null, Name + " foi aprovado");
    }else{
        JOptionPane.showMessageDialog(null, Name + " foi aprovado");
    }
}
}//finalizando a classe
