/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex09;

/**
 *
 * @author Wallyson M. Lima
 */
public class ContaPoupanca extends ContaBancaria{
    
    public ContaPoupanca(String numConta, double saldo) {
        super(numConta, saldo);
    }
    
    private void taxaRendimento(){
        System.out.println("Taxa de rendimento:");
        System.out.println("WIP"); //eu não sei como funciona uma taxa de rendimento de banco
    }
}
