/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios6.facil;
import java.util.ArrayList;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex03 {
    public static void main(String args[]){
        ArrayList<Double> num = new ArrayList<>();
        
        for (double i = 0; i < 5; i++) {
            num.add(i+1);
        }
        
        //imprime o "terceiro" elemento da array, na posição 2..
        System.out.println("Terceiro elemento da lista: " + num.get(2));
    }
}
