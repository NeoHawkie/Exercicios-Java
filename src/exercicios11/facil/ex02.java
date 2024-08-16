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
public class ex02 {
    public static boolean paridade(int num){
        return 0 == num % 2;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada;
        
        System.out.print("Entre com um numero inteiro: ");
        entrada = input.nextInt();
        System.out.println("\nO numero " + entrada + " e par?" + paridade(entrada));
    }
}
