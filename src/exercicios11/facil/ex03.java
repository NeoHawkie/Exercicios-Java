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
public class ex03 {
    public static int fatorial(int n){
        int F = 1;
        for (int i = 1; i < n+1; i++) {
            F *= i; 
        }
        return F;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        
        System.out.print("Entre com um numero inteiro: ");
        num = input.nextInt();
        System.out.println(num + "! = " + fatorial(num));
    }
}
