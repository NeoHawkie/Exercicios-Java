/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios10.facil;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex04 {
    public static void main(String[] args) {
        int matriz[][] = {
            {1, 0, 1},
            {4, 1, 1},
            {1, -2, 1}
        };
        int somaDasDiagonais=0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i == j) || (Math.abs(i+j) == 2)){
                    somaDasDiagonais += matriz[i][j];
                }
            }
        }
        System.out.println("Matriz:");
        for (int i = 0; i < 3; i++) {
            System.out.println(String.format("[%d] [%d] [%d]",
                    matriz[i][0], matriz[i][1], matriz[i][2]));
        }
        System.out.println("Soma das diagonais: " + somaDasDiagonais);
    }
}
