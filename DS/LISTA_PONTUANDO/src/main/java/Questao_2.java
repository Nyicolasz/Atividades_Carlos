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

//Classe Questao_2
public class Questao_2 {
    
    //pacote de extensão do núcleo de java
    public static void main (String[] args){
         //Chamando metodo
        Diferenca();
    }
    
    //Criando Metodo, variaveis e fazendo a entrada de dados
    static void Diferenca(){
    double N1, N2, Diferenca;
    
    N1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeir número: "));
    N2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeir número: "));
    
    //Estrutura para ssaber qual é o maior
    if(N1 < N2){
        double Troca = N1;
        N1 = N2;
        N2 = Troca;
         
        //Calculo
        Diferenca = N1 - N2;
        
        
        //resultado
        JOptionPane.showMessageDialog(null, "A diferença dos entre os números digitados é de: " + Diferenca);
    }
   }
    
}
