/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex020 {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        int n;
        
        System.out.print("Entre com um numero inteiro: ");
        n = scan.nextInt();
        
        if ((n % 2) == 0) {
            System.out.print(String.format("\nO numero %d e par.\n", n));
        }else{
            System.out.print(String.format("\nO numero %d e impar.\n", n));
        }
    }
}
