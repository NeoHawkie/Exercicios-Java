/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios6.intermediario;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex09 {
    public static void main(String args[]){
        ArrayList<Integer> num = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean dupe = false;
        
        System.out.println("Entre com 10 numeros inteiros:");
        for (int i = 0; i < 10; i++) {
            num.add(scan.nextInt());
        }
        
        //ordena e verifica com o elemento ao lado (poderia duplicar a ArrayList para não perder a ordem da original);
        num.sort(null);
        for (int i = 0; i < num.size()-1; i++) {
            if ((num.get(i)).equals(num.get(i+1))) {
                dupe = true;
            }
        }
        System.out.println(num.toString());
        
        if (dupe) {
            System.out.println("Existem numeros duplicados!\n");
        }else{
            System.out.println("Nao existem numeros duplicados.\n");
        }
    }
}

