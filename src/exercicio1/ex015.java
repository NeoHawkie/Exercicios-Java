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
public class ex015 {
    public static void main(String args[]){
        int DiasTrabalhados;
        double salario;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o numero de dias trabalhados pelo funcionario: ");
        DiasTrabalhados = scan.nextInt();
        
        salario = (DiasTrabalhados*8*25);
        
        System.out.print(String.format("Seu salario sera: R$ %.2f\n", salario));
    }
}
