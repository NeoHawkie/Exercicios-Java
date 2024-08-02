/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios6.intermediario;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex06 {
    public static void main(String args[]){
        ArrayList<String> frutas = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome de 5 frutas diferentes:");
        for (int i = 0; i < 5; i++) {
            frutas.add(scan.nextLine().toLowerCase().strip());
        }
        
        frutas.set(2, "morango hehe"); //trocando o 3º elemento por "morango";
        System.out.println("Suas frutas:\n"+ frutas.toString());
    }
}
