/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex31;

/**
 *
 * @author Wallyson M. Lima
 */
public class Caminhao extends Carro{
    private int carga;
    private boolean cargaAcoplada;
    
    public Caminhao(String marca, String modelo, int ano, int numPortas, int carga) {
        super(marca, modelo, ano, numPortas);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isCargaAcoplada() {
        return cargaAcoplada;
    }

    public void setCargaAcoplada(boolean cargaAcoplada) {
        this.cargaAcoplada = cargaAcoplada;
    }
    
    public void soltarCarga(){
        this.cargaAcoplada = false;
        System.out.println("Carga solta.");
    }
    
    public void acoplarCarga(){
        this.cargaAcoplada = true;
        System.out.println("Carga acoplada.");
    }
    
}
