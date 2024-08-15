/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex021 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int ano;
        
        System.out.print("Entre com o ano que deseja verificar: ");
        ano = scan.nextInt();
        
        if (((ano % 4) == 0) && ((ano % 100) != 0) || ((ano % 400) == 0)) {
            System.out.print("\nEste ano e BISSEXTO!\n");   
        }else{
            System.out.print("\nEste ano nao e bissexto...\n");
        }
    }
}
