/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex01;
/**
 *
 * @author Wallyson M. Lima
 */
public class pessoa implements exercicios15.ex04.comparable{
    String nome;
    int idade;
    double altura;

    public pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    @Override //referente ao exercicios15.ex04
    public void comparaIdade(pessoa p1, pessoa p2) {
        int dif = Math.abs(p1.idade - p2.idade);
        System.out.println(String.format("%s, com %d anos, tem %d anos de"
                + " diferença de %s, que tem %d anos.",
                p1.nome, p1.idade, dif, p2.nome, p2.idade));
    }
}
