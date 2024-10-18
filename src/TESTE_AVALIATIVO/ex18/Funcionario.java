/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex18;


/**
 *
 * @author Wallyson M. Lima
 */
public abstract class Funcionario {
    private String nome;
    private double salario;
    
    public void aumentarSalario(double valor){
        this.setSalario(this.getSalario()+valor); //aumenta o salario por um valor fixo.
        System.out.println(this.getNome() + " recebeu um bonus salarial fixo.");
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
}
/* 
    Demonstra que posso utilizar o método de de uma certa classe de forma padrão nas subclasses
    que a chamarem, ou sobreescrita com override para utilizar de uma forma diferente para uma
    subclasse especifica.
*/