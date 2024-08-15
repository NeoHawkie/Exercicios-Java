/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios04.nivel4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


/**
 *
 * @author TI
 */
public class ex15 {
    public static void main(String args[]){
        Random rng = new Random();
        double array[] = new double[10];
        String[] menu = new String[] {"Soma", "Media", "Variancia", "Desvio padrao", "Sair"};
        Scanner scan = new Scanner(System.in);
        double soma = 0, media = 0, variancia = 0, desvio = 0;
        
        System.out.println("preenchendo a array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = rng.nextDouble(100) + 1;
        }
        System.out.println(Arrays.toString(array));
        
        int opcao;
        do {
            System.out.println("");
            System.out.println("- Entre com o numero da opcao desejada -");
            for (int i = 0; i < menu.length; i++) {
                System.out.print(String.format("[%d. %s] ", i+1, menu[i]));
            }
            System.out.println("");
            opcao = scan.nextInt();
            
            switch (opcao) {
                case 1: //soma de todos os valores da array
                    for (int i = 0; i < array.length; i++) {
                        soma += array[i];
                    }
                    System.out.println("Resultado: " + soma);
                    break;
                case 2: //media entre todos os valores da array, se já realizada a soma
                    if (soma == 0) {
                        System.out.println("ERRO: necessario fazer a SOMA primeiro.\n");
                    }else{
                        media = soma/array.length;
                        System.out.println("Resultado: " + media);
                    }
                    break;
                case 3: //variancia da array
                    if (media == 0) {
                        System.out.println("ERRO: necessario calcular a MEDIA primeiro.\n");
                    }else{
                        for (int i = 0; i < array.length; i++) {
                            variancia += (Math.pow(array[i]-media, 2))/(array.length-1);
                        }
                        System.out.println("Resultado: " + variancia);
                    }
                    break;
                case 4: //desvio padrão da array
                    if (variancia == 0) {
                        System.out.println("ERRO: necessario calcular a VARIANCIA primeiro.\n");
                    }else{
                        desvio = Math.sqrt(variancia);
                        System.out.println("Resultado: " + desvio);
                    }
                    break;
                case 5: //sair
                    System.out.println("Voce escolheu sair.\n");
                    break;
                default:
                    System.out.println("ERRO\nENTRE COM UM VALOR VALIDO\n");
                    break;
            }
                        
        } while (opcao != 5);
        
    }
}
