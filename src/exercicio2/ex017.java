/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex017 {
    public static void main(String args[]){
        double velocidade;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com a velocidade do carro em km/h: ");
        velocidade = scan.nextDouble();
        
        if (velocidade <= 80){
            System.out.print("\nVoce esta dentro da velocidade permitida.\n");
        }else{
            System.out.print(String.format("""
                                           Voce esta acima da velocidade maxima!
                                           Sera multado em R$%.2f
                                           """, ((velocidade-80)*5)));
            
        }
    }
}
