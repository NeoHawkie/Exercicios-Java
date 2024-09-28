/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex06;

/**
 *
 * @author Wallyson M. Lima
 */
public class televisao implements dispositivoEletronico{
    private boolean ligado, passandoCanal;
    
    @Override
    public void ligar() {
        if (ligado) {
            System.out.println("TV ja esta ligada.");
        }else{
            ligado = true;
            System.out.println("A TV foi ligada.");
        }
    }

    @Override
    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("TV foi desligada.");
        }else{
            System.out.println("A TV ja esta desligada...");
        }
    }

    @Override
    public void obterStatus() {
        if (ligado) {
            System.out.print("A TV esta ligada");
            if (passandoCanal) {
                System.out.println(" e esta passando um canal.");
            }else{
                System.out.println(" mas nao esta passando nada.");
            }
        }else{
            System.out.println("A TV esta desligada.");
        }
    }
    
}
