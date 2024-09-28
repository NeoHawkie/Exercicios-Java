/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex01;

/**
 *
 * @author Wallyson M. Lima
 */
public class contaCorrente implements conta{
    private double saldo;
    
    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println(String.format("Deposito de R$ %.2f realizado.", valor));
    }

    @Override
    public void sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println(String.format("Saque de R$ %.2f realizado.", valor));
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    
}
