/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex05;

/**
 *
 * @author Wallyson M. Lima
 */
public class produto {
    String nome;
    double preco;
    int estoque;

    public produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
    
    public void comprar(int quantidade){
        if ((estoque > 0) && (estoque >= quantidade)) {
            estoque -= quantidade;
        }else{
            System.out.println("ERRO! QUANTIDADE INDISPONIVEL!");
        }
    }
}
