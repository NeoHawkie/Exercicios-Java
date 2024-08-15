/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author TI
 */
public class ex055 {
    public static void main(String args[]){
        Random rng = new Random(); //rng.nextInt(arg); <- lembrete
        Scanner scan = new Scanner(System.in);
        int life, jogador, maquina;
        
        System.out.println("JOGO DE ADIVINHACAO");
        System.out.println("Advinhe o numero sorteado entre 1 e 10");
        System.out.println("Voce tem 4 vidas. Boa sorte!\n");
        
        for (life = 4; life != 0;) {
            maquina = rng.nextInt(10) + 1;
            //System.out.println(maquina); //teste
            System.out.println("\nQual numero estou pensando?");
            jogador = scan.nextInt();
            
            if (jogador == maquina) {
                System.out.println("Voce acertou! Parabens, voce venceu!\n");
                System.exit(0);
            }else{
                life--;
                System.out.println(String.format("Voce errou! Lhe restam %d vidas.\n", life));
            }
        }
        
        /*
        do {
            maquina = rng.nextInt(10) + 1;
            System.out.println("\nQual numero estou pensando?");
            jogador = scan.nextInt();
            
            if (jogador == maquina) {
                System.out.println("Voce acertou! Parabens, voce venceu!\n");
                System.exit(0);
            }else{
                life--;
                System.out.println(String.format("Voce errou! Lhe restam %d vidas.\n", life));
            }
        } while (life > 0);
        */
        System.out.println("Voce perdeu! Fim de jogo...\n");
            
    }
}
