/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13.ex09;

/**
 *
 * @author Wallyson M. Lima
 */
public class Produto {
    String nome;
    double preco;
    int estoque;
    
    public void vender(int quantidade){
        estoque-= quantidade; //o exercicio n pede pra retornar.. *shrug*
    }
    
    public void reporEstoque(int quantidade){
        estoque+= quantidade;
    }
}
