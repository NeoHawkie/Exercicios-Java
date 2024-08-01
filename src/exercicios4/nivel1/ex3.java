/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios4.nivel1;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex3 {
    public static void main(String args[]){
        Random rng = new Random();
        int array[] = new int[10], numero, posicao=11;
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            array[i] = rng.nextInt(100) + 1;
            //System.out.println(array[i]);
        }
        
        System.out.println("Entre com um numero entre 1 e 100:");
        numero = scan.nextInt();
        
        for (int i = 0; i < 10; i++) {
            if (array[i] == numero){
                posicao = i;
            }
        }
        if (posicao != 11) {
            System.out.println(String.format("Elemento encontrado na posicao %d!", posicao));
        }else{
            System.out.println("Elemento nao encontrado!");
        }
        
        
    }
}
