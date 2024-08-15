/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex009 {
    public static void main(String args[]){
        
        float carteira;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o valor em reais na sua carteira: ");
        carteira = scan.nextFloat();
        
        System.out.print(String.format("\nCom R$%.2f voce consegue comprar US$%.2f!\n", carteira, (carteira/5.45)));
    }
    
}
