/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex16;

/**
 *
 * @author Wallyson M. Lima
 */
public class Geladeira extends Eletrodomestico{
    private int temperatura;
    private boolean hasFreezer;
    public Geladeira(String marca, String modelo, boolean hasFreezer) {
        super(marca, modelo);
        this.temperatura = 0;
        this.hasFreezer = hasFreezer;
    }
    
    public void degelo(){
        if (hasFreezer) {
            this.temperatura = 0;
            System.out.println("Deixe o medidor de temperatura em zero (desligado) para o degelo.");
        }else{
            System.out.println("Geladeira sem congelador.");
        }
    }
    
    public void subirTemperatura(){
        if ((this.temperatura >= 0) && (this.temperatura < 6)) {
            this.temperatura++;
        }else{
            System.out.println("Valor maximo do medidor de temperatura é 6.");
        }
    }
    
    public void diminuirTemperatura(){
        if ((this.temperatura > 0) && (this.temperatura <= 6)) {
            this.temperatura--;
        }else{
            System.out.println("Geladeira desligada.");
        }
    }
}
