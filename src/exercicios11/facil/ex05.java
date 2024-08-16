/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios11.facil;
import java.util.Scanner;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex05 {
    public static int totVogais(String string){
        char[] vogal = {'a', 'e', 'i', 'o', 'u'};
        char[] texto = string.toLowerCase().toCharArray();
        int total=0;
        
        for (int i = 0; i < string.length(); i++) {
            for (int j = 0; j < vogal.length; j++) {
                if (texto[i] == vogal[j]) {
                    total++;
                }
            }
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com uma string: ");
        String texto = input.nextLine();
        input.close();
        
        System.out.println("Total de vogais nesta frase: " + totVogais(texto));
        
    }
}
