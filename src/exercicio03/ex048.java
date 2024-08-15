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
public class ex048 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int temp, tot = 0;
        
        System.out.println("Entre com 7 numeros inteiros abaixo.");
        for (int i = 0; i < 7; i++) {
            System.out.print(String.format("Numero %d: ", i+1));
            temp = scan.nextInt();
            tot = tot + temp;
        }
        System.out.println("Somatorio total: " + tot);
    }
    
}
