/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.exInterface;

/**
 *
 * @author Wallyson M. de Lima
 */
public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado, passandoPrograma;
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.passandoPrograma = false;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setPassandoPrograma(boolean passandoPrograma) {
        this.passandoPrograma = passandoPrograma;
    }

    public int getVolume() {
        return volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public boolean isPassandoPrograma() {
        return passandoPrograma;
    }

    @Override
    public void ligarDesligar() {
        if (this.isLigado()) {
            this.setLigado(false);
        }else{
            this.setLigado(true);
        }
    }

    @Override
    public void abrirMenu() {
        System.out.println("Esta ligado? " + this.isLigado());
        System.out.println("Esta passando programa? " + this.isPassandoPrograma());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i+=10) {
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando o menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 10);
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() - 10);
        }
        
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && (this.getVolume() > 0)) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado() && (this.getVolume() == 0)) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.isLigado() && !(this.isPassandoPrograma())) {
            this.setPassandoPrograma(true);
        }else{
            System.out.println("Nao foi possivel reproduzir...");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() && this.isPassandoPrograma()) {
            this.setPassandoPrograma(false);
        }else{
            System.out.println("Nao foi possivel pausar...");
        }
    }
}
