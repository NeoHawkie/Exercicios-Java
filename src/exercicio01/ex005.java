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
public class ex005 {
    public static void main(String args[]) {
    
        String nomeAluno;
         double nota1, nota2, mediaAluno;
        Scanner teclado = new Scanner(System.in);
    
        //pergunta o nome
        System.out.printf("Entre com o nome do aluno: ");
        nomeAluno = teclado.nextLine();
    
        //pede as notas
        System.out.print("Agora entre com as notas deste aluno.\nNota da primeira prova: ");
        nota1 = teclado.nextDouble();
        System.out.print("Nota da segunda prova: ");
        nota2 = teclado.nextDouble();
        //confirma se a nota é um valor adequado
        if (((nota1 > 10) || (nota2 > 10)) || (nota1 < 0) || (nota2 < 0)) {
        System.out.println("\nERRO\nA NOTA PRECISA SER UM VALOR ENTRE 0 E 10!");
        System.exit(0);
        }
    
        //calcula a média e dá os resultados
        mediaAluno = (nota1 + nota2)/2;
        System.out.println("\nA nota total de " + nomeAluno + " foi de: " + (nota1 + nota2));
        System.out.println("\nSua media eh: " + mediaAluno);
   
        //diz se o aluno foi aprovado ou não
        if (mediaAluno >= 7) {
            System.out.println("\n" + nomeAluno + " esta aprovado!");
        }
        else {
            System.out.println("\n" + nomeAluno + " esta reprovado...");
        }
    }
}
  
