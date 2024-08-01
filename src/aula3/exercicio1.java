/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;
import java.time.Year;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class exercicio1 {
    public static void main(String args[]){
        
        //dept de tragos
        Scanner scan = new Scanner(System.in);
        int idade, ano;
        
        System.out.print("DEPARTAMENTO DE TRAGOS\nEntre com seu ano de nascimento: ");
        ano = scan.nextInt();
        
        idade = (Year.now().getValue()) - ano;
        
        if (idade >= 18){
            System.out.print("\nApto para beber!\n");
        }else{
            System.out.print("\nso nescau e toddynho\n");
        }
    }
}
