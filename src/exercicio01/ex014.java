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
public class ex014 {
    public static void main(String args[]){
        double kmrodado, dias;
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantos kilometros foram percorridos?\n");
        kmrodado = scan.nextDouble();
        System.out.print("E por quantos dias o carro foi alugado?\n");
        dias = scan.nextDouble();
        
        kmrodado = kmrodado * 0.20;
        dias = dias * 90;
        
        System.out.print(String.format("\nO valor do aluguel do carro ficou em: %.2f\n", (kmrodado+dias)));
        
    }
    
}
