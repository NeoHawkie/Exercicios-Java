/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios06.intermediario;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex10 {
    public static void main(String args[]){
        
        ArrayList<String> animais = new ArrayList<>();
        ArrayList<String> animaisbkp = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome de 4 animais:");
        for (int i = 0; i < 4; i++) {
            animais.add(scan.nextLine());
        }
        
        System.out.println("");
        animaisbkp.addAll(animais);
        System.out.println("Sua lista foi salva!\n"+ animaisbkp.toString());
        
    }
}
