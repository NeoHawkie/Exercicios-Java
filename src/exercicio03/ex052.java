/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex052 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        int idades[] = new int[10];
        int maisvelho = 0, maioridade = 0, menordecinco = 0;
        double media = 0;
        
        System.out.println("Entre com a idade de 10 pessoas:\n");
        for (int i = 0; i < 10; i++) {
            idades[i] = scan.nextInt();
            media = media + idades[i];
            
            if (maisvelho < idades[i]) {
                maisvelho = idades[i];
            }
            
            if (idades[i] < 5) {
                menordecinco++;
            }else if (idades[i] > 18) {
                maioridade++;
            }
        }
        media = media/10;
        
        System.out.println(String.format("""
                                         A media das idades inseridas e %.2f;
                                         %d pessoas tem mais de 18 anos;
                                         %d pessoas tem menos de 5 anos;
                                         e a pessoa mais velha tem %d anos""", media, maioridade, menordecinco, maisvelho));
    }
}
