/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios6.dificil;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex13 {
    public static void main(String args[]){
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        Random rng = new Random();
        
        System.out.println("Preenchendo as listas");
        for (int i = 0; i < 5; i++) {
            num1.add(rng.nextInt(10)+1);
            num2.add(rng.nextInt(10)+1);
        }
        System.out.println("1. " + num1.toString() + "\n2. "
                + num2.toString());
        
        Set<Integer> num1U2 = new HashSet<>();
        num1U2.addAll(num1);
        num1U2.addAll(num2);
        
        System.out.println("Somadas e sem duplicadas:");
        System.out.println("R: " + num1U2.toString());
    }
}
