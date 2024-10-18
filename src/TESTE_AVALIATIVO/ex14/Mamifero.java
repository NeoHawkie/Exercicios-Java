/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex14;


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
/*
    O conceito de herança ajuda a reutilizar o código ao não se tornar necessário
    recriar as variaveis para informações gerais do animal, visto que todo o resto é
    reutilizado e o a mais que é necessário é adicionado na classe atual.
*/