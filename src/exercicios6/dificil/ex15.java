/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios6.dificil;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex15 {
    public static void main(String[] args) {
        ArrayList<String> palavras = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com 6 palavras:");
        for (int i = 0; i < 6; i++) {
            palavras.add(scan.nextLine());
        }
        System.out.println("Lista:\n" + palavras.toString());
        
        for (int j = 0; j < palavras.size()/2; j++) {
            String temp = palavras.get(palavras.size()-j-1);
            palavras.set(palavras.size()-j-1, palavras.get(j));
            palavras.set(j, temp);
        }
        
        System.out.println("Lista invertida:\n" + palavras.toString());
    }
}
