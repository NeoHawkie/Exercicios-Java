/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios04.nivel4;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author TI
 */
public class ex10 {
    public static void main(String args[]){
        Random rng = new Random();
        int array[] = new int[10];
        
        System.out.println("preenchendo a array:");
        for (int i = 0; i < 10; i++) {
            array[i] = rng.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(array));
        
        int maior = array[0], menor = array[0], posi1 = 0, posi2 = 0;
        
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] > maior) {
                maior = array[i];
                posi1 = i+1;
            }
            if (array[i] < menor) {
                menor = array[i];
                posi2 = i+1;
            }

        }
        
        System.out.println(String.format("\nMaior elemento: %d na posicao %d\nMenor elemento: %d na posicao %d", maior, posi1, menor, posi2 ));
    }
    
}
