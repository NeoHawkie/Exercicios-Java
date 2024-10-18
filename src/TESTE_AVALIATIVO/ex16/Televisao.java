/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex16;

/**
 *
 * @author Wallyson M. Lima
 */
public class Televisao extends Eletrodomestico{
    private int canal, volume;
    private boolean ligado;
    public Televisao(String marca, String modelo, boolean ligado) {
        super(marca, modelo);
        this.ligado = false;
        this.canal = 0;
        this.volume = 0;
    }

    public void ligar() {
        this.ligado = true;
    }

    public void desligar() {
        this.ligado = false;
    }

    public void proximoCanal(){
        this.canal++;
    }
    
    public void voltarCanal(){
        this.canal--;
    }
    
    public void aumentarVol(){
        this.volume++;
    }
    
    public void diminuirVol(){
        this.volume--;
    }
    
}
