/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios4.nivel3;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Random;
/**
 *
 * @author TI
 */
public class ex7 {
    public static void main(String args[]){
        Random rng = new Random();
        int array[] = new int[10];
        
        System.out.println("preenchendo a array:");
        for (int i = 0; i < 10; i++) {
            array[i] = rng.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(array));
        
        //conversão de Array para Stream
        IntStream stream = Arrays.stream(array);
        
        System.out.println("removidas as duplicadas:");
        System.out.println(Arrays.toString(stream.distinct().toArray()));
        
        
    }
}
