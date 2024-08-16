/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios10.facil;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex01 {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9, 10}
        };
        
        int soma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                soma += matriz[i][j];
                System.out.println("somando " + matriz[i][j]);
            }
        }
        System.out.println("Soma total: " + soma);
        System.out.println("matriz irregular: "+ matriz[2][3]); //teste de matriz irregular
    }
}
