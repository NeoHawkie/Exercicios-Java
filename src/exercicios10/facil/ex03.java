/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios10.facil;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex03 {
    public static int[][] matrizTransposta(int matriz[][], int x, int y){
        int transposta[][] = new int[x][y];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }
        return transposta;
    }
    
    public static void main(String[] args) {
        int matriz[][] = {
            {5, 7, 9},
            {8, 1, 6},
            {8, 21, 1}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("[%d] [%d] [%d]",
                    matriz[i][0], matriz[i][1], matriz[i][2]));
        }
        
        matriz = matrizTransposta(matriz, 3, 3);
        System.out.println("\nMatriz transposta:");
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("[%d] [%d] [%d]",
                    matriz[i][0], matriz[i][1], matriz[i][2]));
        }
    }
}