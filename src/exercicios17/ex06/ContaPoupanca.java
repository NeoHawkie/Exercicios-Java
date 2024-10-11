/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex06;

/**
 *
 * @author Wallyson M. Lima
 */
public class ContaPoupanca extends ContaBancaria{
    private int taxaJuros;
    public ContaPoupanca(String numConta, double saldo, int taxaJuros) {
        super(numConta, saldo);
        this.taxaJuros = taxaJuros;
    }

    public void setTaxaJuros(int taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public int getTaxaJuros() {
        return taxaJuros;
    }
    
}
