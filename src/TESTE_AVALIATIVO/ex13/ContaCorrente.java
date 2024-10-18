/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex13;

/**
 *
 * @author Wallyson M. Lima
 */
public class ContaCorrente {
    private String numConta;
    private double saldo;

    public ContaCorrente(String numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}

/* 
    encapstulamento é proteger as informações de uma variavel, tornando ela
    protegida ou particular.
*/