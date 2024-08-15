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
public class ex01 {
    public static void main(String args[]){
        ArrayList<String> cidades = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com 5 nomes de cidades:");
        for (int i = 0; i < 5; i++) {
            cidades.add(scan.nextLine());
        }
        
        System.out.println("Estes foram as cidades digitadas:");
        for (String n : cidades) {
            System.out.print(n + "; ");
        }
        System.out.println("");
    }
}
