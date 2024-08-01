/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios4.nivel3;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author TI
 */
public class ex9 {
    public static void main(String args[]){
        Random rng = new Random();
        int array[] = new int[10];
        int par = 0, impar = 0;
        
        System.out.println("preenchendo a array:");
        for (int i = 0; i < 10; i++) {
            array[i] = rng.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(array));
        
        
        for (int i = 0; i < 10; i++) {
            if (array[i]%2 == 0) {
                par++;
            }else{
                impar++;
            }
        }
        
        System.out.println(String.format("\nElementos pares: %d\nElementos impares: %d\n", par, impar));
    }
}
