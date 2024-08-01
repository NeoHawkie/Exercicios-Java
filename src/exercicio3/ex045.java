/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex045 {
        public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a, b, c, temp;
        System.out.println("Entre com o valor inicial, final, e o incremento da contagem desejada:\n");
        a = scan.nextInt();
        b = scan.nextInt();
        c = Math.abs(scan.nextInt());
        
        if (a > b){
            temp = a;
            a = b;
            b = temp;
        }
        
        for (int i = a; i <= b; i = i + c) {
            System.out.println(i);
        }
        System.out.println("Acabou!");
        
    }
}