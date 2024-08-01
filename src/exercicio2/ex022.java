/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;
import java.time.Year;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex022 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int nasc, idade;
        
        System.out.print("Entre com seu ano de nascimento: ");
        nasc = scan.nextInt();
        
        idade = (Year.now().getValue()) - nasc;
        
        if (idade > 18){
            System.out.println(String.format("Voce deveria ter se alistado em %d.\n", nasc + 18));
        }else{
            System.out.println(String.format("Voce deve se alistar em %d.\n", nasc + 18));
        }
       
    }
}
