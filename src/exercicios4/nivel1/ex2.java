/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios4.nivel1;
import java.util.Random;
/**
 *
 * @author TI
 */
public class ex2 {
    public static void main(String args[]){
        Random rng = new Random();
        int array[] = new int[10];
        int soma=0;
        
        for (int i = 0; i < 10; i++) {
            array[i] = rng.nextInt(100) + 1;
            soma += array[i];
        }
        System.out.println(soma);
    }
}
