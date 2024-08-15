/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios04.nivel5;
import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex13 {
    public static void main(String args[]){
        String[] menu = new String[] {"Calcular Soma", "Exibir Media", "Sair"};
        Scanner scan = new Scanner(System.in);
        int entrada, A, B;
        
        System.out.println("Entre com o valor de A e B:");
        A = scan.nextInt();
        B = scan.nextInt();
        

        do {
            System.out.println("Entre com uma das opcoes a seguir: ");
            for (int i = 0; i < menu.length; i++) {
                System.out.print("[" + (i+1) + ". " + menu[i] + "] ");
            }
            
            System.out.println("");
            entrada = scan.nextInt();
            //System.out.println(entrada);
                
            switch (entrada) {
                case 1:
                    System.out.println("O resultado e " + (A+B) + "\n");
                    break;
                case 2:
                    System.out.println("Media entre A e B: " + ((A+B)/2) + "\n");
                    break;
                case 3:
                    System.out.println("Voce escolheu sair.\n");
                    break;
                default:
                    System.out.println("Erro! Entre com uma opcao valida.\n");
            }
        } while (entrada != 3);
        
    }
}
