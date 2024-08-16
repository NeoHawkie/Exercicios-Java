/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios11.facil;
import java.util.Scanner;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex01 {
    
    public static int somaDois(int a, int b){
     int soma = a + b;
     return soma;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y;
        
        System.out.println("Entre com dois valores inteiros:\n");
        x = input.nextInt();
        y = input.nextInt();
        input.close();
        
        System.out.println("Sua soma: "+ somaDois(x, y));
    }
}
