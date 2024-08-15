/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;
import java.util.Random;
/**
 *
 * @author TI
 */
public class ex050 {
    public static void main(String args[]){
        Random rng = new Random();
        int randint, cincom = 0, div3 = 0;
        
        System.out.println("20 numeros sorteados abaixo!\n");
        for (int i = 0; i < 20; i++) {
            randint = rng.nextInt(11);
            if (randint > 5){
                cincom++;
            }
            if (randint % 3 == 0) {
                div3++;                
            }
            System.out.println(String.format("Numero %2d:   %2d", (i+1), randint));
        }
        System.out.println(String.format("\n%d destes numeros sao maiores que 5\n%d destes numeros sao divisiveis por 3\n", cincom, div3));
    }
}
