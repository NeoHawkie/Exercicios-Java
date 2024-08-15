/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios04.desafios;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

/**
 *
 * @author TI
 */
public class desafio1 {
    public static void main(String args[]){
        Random rng = new Random();
        Scanner scan = new Scanner(System.in);
        int x = rng.nextInt(100)+1;
        int player, pts = 0;
        
        System.out.println("Tente advinhar o numero entre 1 e 100!\nQuantos menos pontos fizer, melhor!\n");
        
        do {
            System.out.println("Entre com seu chute: ");
            player = scan.nextInt();
            
            if (player > x) {
                System.out.println("Errrrrrooou!\nPense em um numero mais BAIXO...\n");
            }else if (player < x){
                System.out.println("Errrrrrooou!\nPense em um numero mais ALTO...\n");
            }else {
                System.out.println("\n\nVoce acertou!\nVoce fez " + pts + " pontos!\n");
                System.out.println("PARABENS!\n");
                break;
            }
            if (Math.abs(player-x) < 10 ) {
                System.out.println("~~esta esquentando~~");
            }
            pts++;
        } while (player != x);
        
    }
}
