/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex06;

/**
 *
 * @author Wallyson M. Lima
 */
public class radio implements dispositivoEletronico{
    private boolean ligado, tocandoSom;
    
    @Override
    public void ligar() {
        if (ligado) {
            System.out.println("Radio ja esta ligado.");
        }else{
            ligado = true;
            System.out.println("O radio foi ligado.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("Radio foi desligado.");
        }else{
            System.out.println("O radio ja esta desligado...");
        }
    }

    @Override
    public void obterStatus() {
        if (ligado) {
            System.out.print("O radio esta ligado");
            if (tocandoSom) {
                System.out.println(" e esta tocando som.");
            }else{
                System.out.println(" mas nao esta tocando som.");
            }
        }else{
            System.out.println("O radio esta desligado.");
        }
    }
    
}
