/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13.ex2;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class mainContaBancaria {
    public static void main(String[] args) {
        contaBancaria c1 = new contaBancaria();
        c1.numeroConta = "5673876-2";
        c1.saldo = 1088.98;
        c1.titular = "Wallyson M. Lima";
        
        System.out.println(c1.saldo);
        
        c1.depositar(20);
        System.out.println(c1.saldo);
        
        c1.sacar(155.06);
        System.out.println(c1.saldo);
    }
}
