/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios06.facil;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex05 {
    public static void main(String args[]){
        ArrayList<Character> letras = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com 4 caracteres:");
        for (int i = 0; i < 4; i++) {
            letras.add(scan.next().charAt(0)); //scan do char no index 0;       
        }
        
        System.out.println("Itens inseridos:");
        for (char n : letras) {
            System.out.print(n + "; ");
        }
        System.out.println("");
        
        System.out.println("Tamanho da lista: " + letras.size());
    }
}
