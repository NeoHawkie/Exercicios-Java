/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex28;

/**
 *
 * @author Wallyson M. Lima
 */
public class ContaBancaria{
    protected String numConta;
    protected double saldo;

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public ContaBancaria(String numConta, double saldo) {
        this.numConta = numConta;
        this.saldo = saldo;
    }
}
