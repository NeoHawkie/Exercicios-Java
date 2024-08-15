/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios06.intermediario;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex08 {
    public static void main(String args[]){
        ArrayList<String> paises = new ArrayList<>(5);
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome de cinco paises:");
        for (int i = 0; i < 5; i++) {
            paises.add(scan.nextLine().toLowerCase().strip());
        }
        
        System.out.println("Paises inseridos na lista:");
        for (int i = 0; i < paises.size(); i++) {
            System.out.println("Pais " + (i+1) + ": " + paises.get(i));
        }
        
    }
}
