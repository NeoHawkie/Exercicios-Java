/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex002 {
    public static void main(String args[]) {
        
        Scanner scan = new Scanner(System.in);
        String nome;
        
        System.out.print("Entre com o nome de usuario: ");
        nome = scan.nextLine();
        
        System.out.println("\nOla " + nome + ". Seja bem-vindo!");

    }
}
