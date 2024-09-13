/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13.ex1;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class pessoa {
    String nome;
    int idade;
    double altura;
    
    public void apresentar(){
        System.out.println("Ola! Meu nome e "
                + nome
                + ", tenho "
                + idade
                + " anos e "
                + altura
                + " de altura.\n");
    }           
}
