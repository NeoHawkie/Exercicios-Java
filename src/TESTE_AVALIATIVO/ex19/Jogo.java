/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex19;

/**
 *
 * @author Wallyson M. Lima
 */
public abstract class Jogo {
    private String nome;

    public String getNome() {
        return nome;
    }

    public Jogo(String nome) {
        this.nome = nome;
    }
    public abstract void jogar();
}
