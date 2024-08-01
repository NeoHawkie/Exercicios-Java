/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex049 {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        int par =0 , impar = 0, temp;
        
        System.out.println("Entre com 6 numeros inteiros:");
        for (int i = 0; i < 6; i++) {
            temp = scan.nextInt();
            if (temp %2 == 0){
                par++;
            }else{
                impar++;
            }
        }
        System.out.println(String.format("\nDos numeros inseridos, %d sao pares e %d sao impar.\n", par, impar));
    }
    
}
