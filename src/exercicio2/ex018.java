/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;
import java.time.Year;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex018 {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        int idade, ano;
        
        System.out.print("Entre com seu ano de nascimento: ");
        ano = scan.nextInt();
        
        idade = (Year.now().getValue()) - ano;
        
        if (idade >= 18){
            System.out.print("\nSeu voto e obrigatorio.\n");
        }else if (idade >= 16){
            System.out.print("\nCaso tenha a carteira, voce pode votar.\n");
        }else{
            System.out.print("\nNao pode votar.\n");
        }
        
    }
}
