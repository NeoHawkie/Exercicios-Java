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
public class ex8 {
    public static void main(String args[]){
        int array1[] = new int[5];
        int array2[] = new int[5];
        Random rng = new Random();
        
        System.out.println("preenchendo as arrays:");
        for (int i = 0; i < 5; i++) {
            array1[i] = rng.nextInt(100) + 1;
            array2[i] = rng.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(array1) + "\n" + Arrays.toString(array2));
        
        int somaArray[] = new int[array1.length + array2.length];
        
        for (int i = 0, j = 0; i < somaArray.length/2; i++, j++) {
            somaArray[j] = array1[i];
            
            j++;
            somaArray[j] = array2[i];
        }
        
        System.out.println("\narrays somadas:");
        System.out.println(Arrays.toString(somaArray));
        
    }
}
