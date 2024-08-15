/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios04.nivel4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex14 {
    public static void main(String args[]){
        Random rng = new Random();
        int array[] = new int[10];
        Scanner scan = new Scanner(System.in);
        
        System.out.println("preenchendo a array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = rng.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(array));
        
        System.out.println("");
        int numero, indice;
        System.out.println("Entre com um numero: ");
        numero = scan.nextInt();
        System.out.println("Entre com um indice: ");
        indice = scan.nextInt();
        System.out.println("");
        
        if ((indice > (array.length-1)) || (indice < 0)) {
            System.out.println("Indice invalido!");
        }else{
            array[indice] = numero;
            System.out.println("Indice valido.\n");
        }
        
        boolean existe = false;
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (numero == array[i]) {
                existe = true;
                pos = i;
            }
        }
        if (existe) {
            System.out.println(String.format("O numero %d aparece neste array no indice %d.\n", numero, pos));
        }else{
            System.out.println(String.format("O numero %d NAO existe nesta array.\n", numero));
        }
    }
}
