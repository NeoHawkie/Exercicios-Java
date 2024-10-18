/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex03;

/**
 *
 * @author Wallyson M. Lima
 */
public class Veiculo {
    private String marca, modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
}

/*  
    A herança neste caso pode possuír diversos papéis, mas aparenta ser para manter fixos
    os dados em Veiculo, visto que todo o carro É UM VEÍCULO.
*/