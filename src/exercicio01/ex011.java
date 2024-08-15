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
public class ex011 {
    public static void main(String args[]){
    
        double a, b, c, delta;
        Scanner teclado = new Scanner(System.in);
    
        System.out.print("""
                        Entre com os valores 'a', 'b' e 'c' 
                        de uma equacao de segundo grau:
                        """);
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
    
        delta = (Math.pow(b,2)) - (4*a*c);
        
        System.out.print(String.format("O valor de delta e: %.2f\n", delta));
    }
    
}
