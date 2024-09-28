/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex06;

/**
 *
 * @author Wallyson M. Lima
 */
public class celular implements dispositivoEletronico{
    private boolean ligado;
    private int bateria;
    
    
    @Override
    public void ligar() {
        if (ligado) {
            System.out.println("Celular ja esta ligado.");
        }else{
            ligado = true;
            System.out.println("O celular foi ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Celular foi desligado.");
        }else{
            System.out.println("O celular ja esta desligado...");
        }
    }

    @Override
    public void obterStatus() {
        if (ligado && bateria > 0) {
            System.out.print("Celular ligado;\n" + bateria + "% de bateria.");
        }else{
            System.out.println("O celular esta desligado.");
        }
    }
    
}
