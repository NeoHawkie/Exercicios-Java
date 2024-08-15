/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex044 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.println("Entre com o valor inicial, final, e o incremento da contagem desejada:\n");
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        for (int i = a; i <= b; i = i + c) {
            System.out.println(i);
        }
        System.out.println("Acabou!");
    }
}
