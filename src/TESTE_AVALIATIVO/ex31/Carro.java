/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex31;

/**
 *
 * @author Wallyson M. Lima
 */
public class Carro extends Veiculo {
    private int numPortas;
    private boolean capoAberto;
    
    public Carro(String marca, String modelo, int ano, int numPortas) {
        super(marca, modelo, ano);
        this.numPortas = numPortas;
        this.capoAberto = false;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    public void abrirCapo(){
        this.capoAberto = true;
        System.out.println("Capo aberto.");
    }

    public boolean isCapoAberto() {
        return capoAberto;
    }

    public void setCapoAberto(boolean capoAberto) {
        this.capoAberto = capoAberto;
    }
    
    public void fecharCapo(){
        this.capoAberto = false;
        System.out.println("Voce fechou o capo.");
    }
}
