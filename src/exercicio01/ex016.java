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
public class ex016 {
    public static void main(String args[]){ 
        double DiasPerdidos, cig, ano;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com a quantia de cigarros fumados por dia: ");
        cig = scan.nextDouble();
        System.out.print("Agora, entre com quantos anos esta pessoa ja fumou: ");
        ano = scan.nextDouble();
        
        // (total de cigs ao ano por 10 min) / minutos em um dia
        DiasPerdidos = ((cig * (ano * 365)) * 10) / 1440; 
        
        System.out.print(String.format("Esta pessoa perdeu %.2f dias de sua vida...\n", DiasPerdidos));
    }
}
