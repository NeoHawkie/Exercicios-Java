/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex019 {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        String aluno;
        double n1, n2, media;
        
        System.out.print("Entre com o nome do aluno: ");
        aluno = scan.nextLine();
        
        System.out.print("Agora entre com o valor de cada nota:\n");
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        
        media = (n1+n2)/2;
        System.out.print(String.format("\nSua media e de %.2f\n", media));
        
        if (media >= 7){
            System.out.print(String.format("\nCom media %.2f, o aluno %s esta aprovado!\n", media, aluno));
        }else{
            System.out.print(String.format("\nCom media %.2f, o aluno %s esta de recuperacao...\n", media, aluno));
        }
    }
}
