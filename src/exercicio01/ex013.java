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
public class ex013 {
    public static void main(String args[]){
        float salario;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o salario do funcionario em reais: ");
        salario = scan.nextFloat();
        
        System.out.print(String.format("Seu novo salario sera de R$%.2f\n", salario*1.15));
    }
}
