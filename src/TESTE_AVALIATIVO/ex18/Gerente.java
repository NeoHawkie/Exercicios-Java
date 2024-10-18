/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex18;
/**
 *
 * @author Wallyson M. Lima
 */
public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void aumentarSalario(double porcentagem) {
        this.setSalario(this.getSalario() * ((porcentagem)/100)+1); //aumenta o salario em porcentagem
        System.out.println(String.format("%s recebeu um aumento salarial de %.2f",
                                        this.getNome(), porcentagem) + "%.");
    }
    
}
/* 
    Demonstra que posso utilizar o método de de uma certa classe de forma padrão nas subclasses
    que a chamarem, ou sobreescrita com override para utilizar de uma forma diferente para uma
    subclasse especifica.
*/