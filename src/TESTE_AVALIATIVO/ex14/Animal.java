/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex14;


/**
 *
 * @author Wallyson M. Lima
 */
public class Animal {
    protected String nome;
    protected int idade;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
}
/*
    O conceito de herança ajuda a reutilizar o código ao não se tornar necessário
    recriar as variaveis para informações gerais do animal, visto que todo o resto é
    reutilizado e o a mais que é necessário é adicionado na classe atual.
*/