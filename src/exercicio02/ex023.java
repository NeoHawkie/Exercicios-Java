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
public class ex023 {
    public static void main(String args[]){
        
        String nome, sexo;
        double vtotal;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Preencha os dados a seguir.\n");
        System.out.print("Nome completo: ");
        nome = scan.nextLine();
        System.out.print("Sexo: ");
        sexo = scan.nextLine().strip().toUpperCase();
        //teste System.out.println(sexo);
        if ((!"M".equals(sexo)) && (!"F".equals(sexo))){
            System.out.println("!!! ERRO !!!\nEntre com 'M' ou 'F'.");
            System.exit(0);
        }else{
            
        }
        System.out.print("Valor total da compra: ");
        vtotal = scan.nextDouble();
        
        if ("M".equals(sexo)){
            vtotal = vtotal*0.95;
        }else{
            vtotal = vtotal*0.87;
        }
        
        System.out.println(String.format("O valor total das compras de %s, com desconto, sera de R$%.2f", nome, vtotal));
    }
}