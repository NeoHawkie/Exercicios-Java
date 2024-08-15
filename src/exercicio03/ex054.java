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
public class ex054 {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        double peso[] = new double[7];
        double altura[] = new double[7];
        double avgH=0;
        int testeB=0, testeC=0, testeD=0;
        
        System.out.println("Entre com peso e altura, em kg e metros, de 7 pessoas:\n");
        for (int i = 0; i < 7; i++) {
            //coleto os dados
            peso[i] = scan.nextDouble();
            altura[i] = scan.nextDouble();
            
            //coleto altura total do grupo
            avgH += altura[i];
            
            if (peso[i] < 50) {//verifico qnts pesam menos de 50kg
                if (altura[i] < 1.6) {//se pesar menos de 50kg, verifico se mede mais de 1,60m
                    testeC++;
                }
            }else if (peso[i] > 90){//senão, verifico quantos pesam mais de 90kg
                testeB++;
                
                if ((peso[i] > 100) && (altura[i] > 1.9)){ //se pesa mais de 90kg, verifico quantos
                testeD++;                                  //medem mais de 1,90m e pesam mais de 100kg
                }
            }
            
            
        }
        
        //calculo a média da altura do grupo
        avgH = avgH/7;
        
        System.out.println(String.format("""
                                         A media de altura do grupo foi %.2fm;
                                         %d pessoas pesam mais de 90kg;
                                         %d pessoas pesam menos de 50kg e medem menos de 1,60m;
                                         %d pessoas pesam mais de 100kg e medem mais de 1,90m""", avgH, testeB, testeC, testeD));
    }
}
