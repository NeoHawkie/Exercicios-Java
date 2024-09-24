/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex11;

/**
 *
 * @author Wallyson M. Lima
 */
public class televisao {
    int volume, canal;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public int getCanal() {
        return canal;
    }

    public televisao(int volume, int canal) {
        this.volume = volume;
        this.canal = canal;
    }
    
    public void aumentarVolume(){
        volume++;
    }
    
    public void diminuirVolume(){
        volume--;
    }
    
    public void trocarCanal(int novoCanal){
        canal = novoCanal;
    }
}
