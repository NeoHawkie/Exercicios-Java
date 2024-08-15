/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios06.dificil;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> palavras = new ArrayList<>();
        
        System.out.println("Preencha a string:");
        for (int i = 0; i < 10; i++) {
            palavras.add(scan.nextLine());
        }
        
        System.out.println("");
        for (int i = 0; i < palavras.size(); i++) {
            if (((palavras.get(i)).length()) > 5 ) { //compara o tamanho
                System.out.println((i+1) + "." + palavras.get(i));
            }
        }
        
    }
}