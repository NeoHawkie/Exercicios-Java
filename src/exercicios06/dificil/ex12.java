/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios06.dificil;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex12 {
    public static void main(String args[]){
        ArrayList<String> nomes1 = new ArrayList<>();
        ArrayList<String> nomes2 = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com cinco nomes para a lista 1:");
        for (int i = 0; i < 5; i++) {
            nomes1.add(scan.nextLine().strip());
        }
        System.out.println("Entre com cinco nomes para a lista 2:");
        for (int i = 0; i < 5; i++) {
            nomes2.add(scan.nextLine().strip());
        }
        System.out.println(String.format("Suas duas listas de nomes:\n1. %s\n2. %s\n",
                            nomes1.toString(), nomes2.toString()));
        
        
        //verifica os nomes iguais
        ArrayList<String> interseccao = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (nomes1.get(i).equals(nomes2.get(j))) {
                    interseccao.add(nomes1.get(j));
                }
            }
        }
        
        if (interseccao.isEmpty()) {
            System.out.println("Nao ha interseccao entre as listas.\n");
        }else{
            System.out.println("Interseccao: " + interseccao.toString());
        }
        
    }
}
