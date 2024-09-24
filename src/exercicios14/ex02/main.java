/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex02;

/**
 *
 * @author Wallyson M. Lima
 */
public class main {
    public static void main(String[] args) {
        contaBancaria c1 = new contaBancaria("0021-153", "Wally", 1100);
        
        System.out.println(c1.getSaldo());
        c1.depositar(20.55);
        System.out.println(c1.getSaldo());
    }
}
