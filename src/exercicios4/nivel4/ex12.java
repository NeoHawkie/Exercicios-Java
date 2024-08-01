/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios4.nivel4;

/**
 *
 * @author TI
 */
public class ex12 {
    public static void main(String args[]){
        String[] array = new String[] {"batata", "frita", "e", "muito", "bom!"};
        String frase = "";
        
        
        for (int i = 0; i < 5; i++) {
            frase += array[i] + " ";
        }
        
        
        //String frase = String.join(" ", array); //método "String.join" parece mais simples..
        
        System.out.println(frase);
        
    }
}
