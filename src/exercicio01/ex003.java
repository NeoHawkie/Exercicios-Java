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
public class ex003 {
    public static void main(String args[]){
        
        float salario;
        String nome;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com o nome do funcionario: ");
        nome = scan.nextLine();
        System.out.print("Entre com o valor do salario de " + nome + ": ");
        salario = scan.nextFloat();
        System.out.println(nome + "tem um salario de R$" + salario);
    }
    
}
