/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios5;
import java.util.Scanner;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int entrada, soma = 0;
        
        System.out.println("Entre com um numero inteiro diferente de '1111':");
        do {
            entrada = input.nextInt();
            soma += entrada;
        } while (entrada != 1111);
        System.out.println("Voce entrou com '1111'!!!");
        System.out.println("Soma total dos numeros inseridos: " + soma);
    }
}
