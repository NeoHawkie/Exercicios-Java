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
public class ex004 {
    public static void main(String args[]){
        
        int a, b;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o valor de A, e em seguida com o valor de B:\n");
        a = scan.nextInt();
        b = scan.nextInt();
        
        System.out.println("A soma entre A e B resulta em: " + (a+b));
        
    }
    
}
