/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class exercicio2 {
    public static void main(String args[]){
        //ESCOLA DE NERDS
        
        Scanner scan = new Scanner(System.in);
        double n1, n2, media;
        
        System.out.print("Entre com a primeira e segunda nota:\n");
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        
        media = (n1 + n2) / 2;
        
        if (media >= 7){
            System.out.print("\nParabens! Voce esta aprovado!\n");
        }else{
            System.out.print("\nSinto muito... Voce foi reprovado.\n");
        }
    }
}
