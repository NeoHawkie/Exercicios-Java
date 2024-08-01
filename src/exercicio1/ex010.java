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
public class ex010 {
    public static void main(String args[]){
        float largura, altura, area, tinta;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com a largura e altura, em metros, da parede a ser pintada:\n");
        largura = scan.nextFloat();
        altura = scan.nextFloat();
        
        area = largura*altura;
        tinta = area/2;
        
        System.out.print(String.format("A parede tera %.2fm^2 e voce ira precisar de %.2fL de tinta para pinta-la.\n", area, tinta));
        
        
    }
    
}
