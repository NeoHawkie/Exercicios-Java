/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex06;

/**
 *
 * @author Wallyson M. Lima
 */
public class ContaCorrente extends ContaBancaria{
    private double limite;
    public ContaCorrente(String numConta, double saldo, double limite) {
        super(numConta, saldo);
        this.limite = limite; 
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }
    
}
