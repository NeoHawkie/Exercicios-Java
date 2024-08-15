/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios05;
import java.util.Scanner;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex58 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int soma=0, idade, contador=0;
        
        System.out.println("Entre com a idade dos seus alunos:");
        do {
            idade = input.nextInt();
            soma += idade;
            contador++;
        } while (idade != 999);
        
        System.out.println("Voce inseriu a idade 999!");
        System.out.println("Idade total da turma: " + (soma-999));
        System.out.println("Total de alunos: " + (contador-1));
    }
}
