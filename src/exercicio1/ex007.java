/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex007 {
    public static void main(String args[]){
        
        float x, dobro, terco;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com um numero real: ");
        x = scan.nextFloat();
        dobro = x*2;
        terco = x/3;
        
        System.out.print("O dobro de " + x + " e: " + dobro);
        System.out.println("O terco de " + x + " e: " + terco);
    }
}
