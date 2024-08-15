/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios04.nivel2;

import java.util.Random;

/**
 *
 * @author TI
 */
public class ex5 {
    public static void main(String args[]){
        Random rng = new Random();
        int array[] = new int[10], media=0;
        
        for (int i = 0; i < 10; i++) {
            array[i] = rng.nextInt(100) + 1;
            System.out.println(array[i]);
        }
        
        for (int i = 0; i < 10; i++) {
            media += array[i];
        }
        media = media/10;
        
        System.out.println("A media da soma e: " + media);
    }
}
