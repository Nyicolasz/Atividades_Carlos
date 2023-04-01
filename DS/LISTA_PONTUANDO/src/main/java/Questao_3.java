//impotação
import javax.swing.JOptionPane;

//Classe Questao_3
public class Questao_3 {
    
    //pacote de extensão do núcleo de java
    public static void main (String[] args){
        
        //Chamando o metodo
        Lampada();
        
    }
    
    //Criando Metodo, variaveis e fazendo a entrada de dados
    static void Lampada(){
        
     int EstadoLampada = Integer.parseInt(JOptionPane.showInputDialog("D1gite 1 - Acessa ou 2- Apagada: "));
     
     //Chamando um metodo e passadno os parametros
      mostraEstado(EstadoLampada);
    }
    
    //criando metodo com parametros 
    static void mostraEstado(int Estado){
        
        //Estrutura de decisão para saber o que printar
        if (Estado == 1){
            JOptionPane.showMessageDialog(null, "Lâmpada acessa");
        }
        else if(Estado == 2){
            JOptionPane.showMessageDialog(null, "Lâmpada apagada");
        }else{
            JOptionPane.showMessageDialog(null, "Erro!! Digite 1 ou 2");
        }
    }
    }