/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex16;

/**
 *
 * @author Wallyson M. Lima
 */
public class aviao {
    String modelo;
    int capacidadePassageiros;
    double velMaxima;

    public String getModelo() {
        return modelo;
    }

    public int getCapacidadePassageiros() {
        return capacidadePassageiros;
    }

    public double getVelMaxima() {
        return velMaxima;
    }

    public aviao(String modelo, int capacidadePassageiros, double velMaxima) {
        this.modelo = modelo;
        this.capacidadePassageiros = capacidadePassageiros;
        this.velMaxima = velMaxima;
    }
}
