/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex01;

/**
 *
 * @author Wallyson M. Lima
 */
public class Caminhao extends Carro{
    private int carga;
    
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
    
    
}
