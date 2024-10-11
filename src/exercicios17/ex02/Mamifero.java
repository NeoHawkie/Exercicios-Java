/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex02;

/**
 *
 * @author Wallyson M. Lima
 */
public class Mamifero extends Animal{
    private String TipoPelo;
    
    public Mamifero(String nome, int idade, String TipoPelo) {
        super(nome, idade);
        this.TipoPelo = TipoPelo;
    }

    public void setTipoPelo(String TipoPelo) {
        this.TipoPelo = TipoPelo;
    }

    public String getTipoPelo() {
        return TipoPelo;
    }
    
}
