/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista_exercicios_03;

/**
 *
 * @author rayli
 */
import javax.swing.JOptionPane;

public class QuestaoDois {
    //Declarando os atributos
    private String Marca;
    private String Modelo;
    private String Cor;
    private String Placa;
    
    public QuestaoDois(){
        this("","","","");
    }
    
    public QuestaoDois (String marca, String modelo, String cor, String placa){
    
        this.Marca = marca;
        this.Modelo = modelo;
        this.Cor = cor;
        this.Placa = placa;
    }
    
    public String getMarca(){
        return Marca;
    }
    
    public void setMarca(String marca){
    this.Marca = marca;
    }
    
    public String getModelo(){
        return Modelo;
    }
    
    public void setModelo(String modelo){
    this.Modelo = modelo;
    }
    
    public String getCor(){
        return Cor;
    }
    
    public void setCor(String cor){
    this.Cor = cor;
    }
    
    public String getPlaca(){
        return Placa;
    }
    
    public void setPlaca(String placa){
    this.Placa = placa;
    }
    
    public void entradaDados() {
        Modelo = JOptionPane.showInputDialog("Modelo: ");
        setModelo(Modelo);
        Marca = JOptionPane.showInputDialog("Marca: ");
        setMarca (Marca);
        Cor = JOptionPane.showInputDialog("Cor: ");
        setCor (Cor);
        Placa = JOptionPane.showInputDialog("Placa: ");
        setCor (Placa);
    }
    
    public void ProvarExistencia (){
    
        JOptionPane.showMessageDialog(null, "Modelo: " +this.getModelo() + "\n Marca:" 
                + this.getMarca() + "\n Cor: " + this.getCor() + "\n  Placa: " + this.getPlaca());
   
        JOptionPane.showMessageDialog(null, "O carro " + this.getModelo() + " ligou");
    
        JOptionPane.showMessageDialog(null, "O carro " + this.getModelo() + " acelerou");
    
        JOptionPane.showMessageDialog(null, "O carro " + this.getModelo() + " freou");
   
        JOptionPane.showMessageDialog(null, "O carro " + this.getModelo() + " desligou");
    }
    
    
    
}


    
    
    
    

    
    
  