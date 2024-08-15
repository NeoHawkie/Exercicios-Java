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
public class ex012 {
    public static void main(String args[]){
        float preco;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o valor do produto em reais: ");
        preco = scan.nextFloat();
        
        System.out.print(String.format("Com desconto este produto sai por R$%.2f\n", preco*0.95));
        
    }
    
}
