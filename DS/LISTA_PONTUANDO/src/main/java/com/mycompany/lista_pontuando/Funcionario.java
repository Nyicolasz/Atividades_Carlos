/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_pontuando;



/**
 *
 * @author Nycolas
 */
import javax.swing.JOptionPane;

public class Funcionario {
    private String nome;
    private Integer nascimento;
    private Double salario;
    
    public Funcionario (){
        this("", 0, 0.0);
    }
    
    public Funcionario(String nome, Integer nascimento, Double salario){
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;
       
    }
    
     public String getNome(){
        return nome;
    }
     
     public void setNome(String nome){
        this.nome = nome;
    }
     
     public Integer getNascimento(){
         
        return nascimento = 2023 - nascimento;
    }
     
     public void setNascimento(Integer nascimento){
         this.nascimento = nascimento;
    }
     
     public Double getSalario(){
        return salario;
    }
     
     public void setSalario(Double salario){
        this.salario = salario;
    }
     public void Acoes(){
         JOptionPane.showMessageDialog(null,nome+" Andou até a aula do melhor professor, Carlão");
         JOptionPane.showMessageDialog(null,nome+" Falou com o maravilhoso Carlos Alberto");
         JOptionPane.showMessageDialog(null,nome+" Bebeu água");
         JOptionPane.showMessageDialog(null,nome+" Comeu strogonoff");
     }
    
     
     public void entradaDados() {
        nome = JOptionPane.showInputDialog("Nome: ");
        setNome(nome);
        
        nascimento = Integer.parseInt(JOptionPane.showInputDialog("Ano de nascimento: "));
        setNascimento (nascimento);
        
        salario = Double.parseDouble(JOptionPane.showInputDialog("Sálario: "));
        setSalario (salario);
        
     }
     
     public void SaidaDados() {
         
     JOptionPane.showMessageDialog(null, "Nome do funcinario: " +this.getNome() + "\n Idade:" 
                + this.getNascimento() + "\n Salario: " + this.getSalario());
     }
}
