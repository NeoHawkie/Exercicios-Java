/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex18;

/**
 *
 * @author Wallyson M. Lima
 */
public class contaBancaria {
    double saldo;
    
    public void sacar(double valor){
        if (saldo >= valor) {
            saldo -= valor;
        }else{
            System.out.println("saldo insuficiente");
        }
    }
}
