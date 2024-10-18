/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex03;

/**
 *
 * @author Wallyson M. Lima
 */
public class Carro extends Veiculo{
    private int numPortas;
    public Carro(String marca, String modelo, int numPortas) {
        super(marca, modelo);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
}

/*  
    A herança neste caso pode possuír diversos papéis, mas aparenta ser para manter fixos
    os dados em Veiculo, visto que todo o carro É UM VEÍCULO.
*/