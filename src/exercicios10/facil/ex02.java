/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios10.facil;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex02 {
    public static void main(String[] args) {
        int[][] matrizId = { //matriz identidade
        {1, 0, 0},
        {0, 1, 0},
        {0, 0, 1}
        };
        
        int verifica = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((i != j) && matrizId[i][j] == 0) {
                    //se for o valor esperado, n faz nada
                }else if ((i == j) && (matrizId[i][j] == 1)) {
                    //se for o valor esperado, n faz nada
                }else{
                    verifica++; //se não for o valor esperado, soma 1
                }
            }
        }
        if (verifica > 0) {
            System.out.println("nao e uma matriz identidade!");
            System.out.println("possui " + verifica + " elementos diferentes.");
        }else{
            System.out.println("e uma matriz identidade!");
        }
    }
}
