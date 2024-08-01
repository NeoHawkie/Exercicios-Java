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
public class ex042 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n;
        
        System.out.println("Entre com um numero inteiro: ");
        n = scan.nextInt();
        
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            /*
            if (i == 10) {
                break;
            }
            */    
        }
        System.out.println("Acabou!");
    }
}
