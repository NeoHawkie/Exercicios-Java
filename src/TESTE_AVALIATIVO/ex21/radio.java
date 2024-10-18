/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex21;


/**
 *
 * @author Wallyson M. Lima
 */
public class radio implements Dispositivo{
    private boolean ligado;
    
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

}
