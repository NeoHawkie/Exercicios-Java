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
public class ex006 {
    public static void main(String args[]){
        
        int x;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com um numero inteiro: ");
        x = scan.nextInt();
        
        System.out.println("O numero que antecede " + x + " e: " + (x-1) + "\ne o numero que o sucede e: " + (x+1));
    
    }
    
}
