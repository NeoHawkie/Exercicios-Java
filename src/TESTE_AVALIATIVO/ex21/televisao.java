/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex21;


/**
 *
 * @author Wallyson M. Lima
 */
public class televisao implements Dispositivo{
    private boolean ligado;
    
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

}
