/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios4.nivel2;

import java.util.Random;

/**
 *
 * @author TI
 */
public class ex4 {
    public static void main(String args[]){
        Random rng = new Random();
        int array[] = new int[10];
        
        System.out.println("Sem sortear!");
        for (int i = 0; i < 10; i++) {
            array[i] = rng.nextInt(100) + 1;
            System.out.println(array[i]);
        }
        
        //bubble sort
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (array[j] > array[j+1]) {
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
        
        System.out.println("Apos sortear");
        for (int i = 0; i < 10; i++) {
            System.out.println(array[i]);
        }
        
    }
}
