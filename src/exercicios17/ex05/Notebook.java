/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex05;

/**
 *
 * @author Wallyson M. Lima
 */
public class Notebook extends DispositivoEletronico{
    private double armazenamento;
    public Notebook(String marca, String modelo, double armazenamento) {
        super(marca, modelo);
        this.armazenamento = armazenamento;
    }

    public double getArmazenamento() {
        return armazenamento;
    }

    public void setArmazenamento(double armazenamento) {
        this.armazenamento = armazenamento;
    }
    
}
