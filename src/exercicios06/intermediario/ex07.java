/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios06.intermediario;
import java.util.Random;
import java.util.ArrayList;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex07 {
    public static void main(String args[]){
        ArrayList<Integer> num = new ArrayList<>();
        Random rng = new Random();
        
        for (int i = 0; i < 10; i++) {
            num.add(rng.nextInt(100)+1);
        }
        System.out.println("A lista atualmente:\n" + num.toString());
        
        num.sort(null);
        System.out.println("\nA lista ordenada:\n" + num.toString());
    }
}
