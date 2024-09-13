/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13.ex2;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class contaBancaria {
    String numeroConta;
    double saldo;
    String titular;
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void sacar(double valor){
        saldo -= valor;
    }
}
