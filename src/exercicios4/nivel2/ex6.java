/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios4.nivel2;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author TI
 */
public class ex6 {
    public static void main(String args[]){
        Random rng = new Random();
        int array[] = new int[10];
        int arrayReverse[] = new int[10];
        
        
        System.out.println("antes de inverter:");
        for (int i = 0; i < 10; i++) {
            array[i] = rng.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < 10; i++) {
            arrayReverse[i] = array[10 - i - 1];
        }
        array = arrayReverse;
        arrayReverse = null;
        
        System.out.println("\napos inverter:");
        System.out.println(Arrays.toString(array));
        
        
    }
}
