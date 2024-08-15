/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas;

import java.util.Scanner;

public class exemploMetodo {
// Método para calcular a média

    public static double calcularMedia(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o número de alunos: ");
        int numAlunos = scanner.nextInt();
        for (int i = 1; i <= numAlunos; i++) {
            System.out.print("Digite o número de notas para o aluno " + i + ": ");
            int numNotas = scanner.nextInt();
            double[] notas = new double[numNotas];
            for (int j = 0; j < numNotas; j++) {
                System.out.print("Digite a nota " + (j + 1) + ": ");
                notas[j] = scanner.nextDouble();
            }
            double media = calcularMedia(notas);
            System.out.println("A média do aluno " + i + " é: " + media);
        }
        scanner.close();
    }
}