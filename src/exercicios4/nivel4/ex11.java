/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios4.nivel4;

import java.util.Arrays;

/**
 *
 * @author TI
 */
public class ex11 {
    public static void main(String args[]){
        String array[] = new String[5];
        //String[] array = new String[] {"banana", "maca", "laranja", "uva", "limao"}; //declaração ja inicializada
        
        //preenchendo a array
        array[0] = "banana";
        array[1] = "maca";
        array[2] = "laranja";
        array[3] = "uva";
        array[4] = "limao";
        
        System.out.println("Frutas:\n");
        //System.out.println(Arrays.toString(array));
        for (String fruta : array) {
            System.out.println(fruta);
        }
        
    }
}
