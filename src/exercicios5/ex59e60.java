/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex59e60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        ArrayList<String> nome = new ArrayList<>();
        ArrayList<Character> sexo = new ArrayList<>();
        ArrayList<Integer> idade = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        int i = 0, totM=0, mediaM;
        String continuar;
        
        System.out.println("--------- CADASTRO DE pissoas ---------");
        do {
            System.out.println("_______________________________________");
            System.out.println("Nome: ");
            nome.add(input1.nextLine().strip().toUpperCase());
            
            System.out.println("Sexo: ");
            sexo.add(input2.nextLine().strip().toUpperCase().charAt(0));
            if (!sexo.get(i).equals('M') && !sexo.get(i).equals('F')) {
                do {
                    System.out.println("!!! ENTRE COM 'M' OU 'F' !!!");
                    sexo.set(i, input2.nextLine().strip().toUpperCase().charAt(0));
                } while (!sexo.get(i).equals('M') && !sexo.get(i).equals('F'));
            }
            i++;
            
            System.out.println("Idade: ");
            idade.add(input3.nextInt());
            System.out.println("_______________________________________");
            
            System.out.println("Deseja cadastrar mais uma pissoa? (S/N)\n");
            continuar = input.next().strip().toUpperCase();
            
        } while (continuar.startsWith("S"));
        System.out.println("---------- CADASTRO COMPLETO ----------");
        
        //a1 e a2)
        System.out.print("\nA maior idade cadastrada: ");
        temp.addAll(idade);
        temp.sort(null);
        System.out.println(temp.getLast());
        temp.clear();
        
        //b)
        System.out.print("Quantos homens foram cadastrados: ");
        i=0;
        do {
            if (sexo.get(i).equals('M')) {
                totM++;
            }
            i++;
        } while (i < sexo.size());
        System.out.println(totM);
        
        //c)
        System.out.println("A idade da mulher mais jovem: ");
        do {
            if (sexo.get(i).equals('F')) {
                temp.add(idade.get(i));
            }
            i++;
        } while (i < sexo.size());
        temp.sort(null);
        System.out.println(temp.getFirst());
        temp.clear();
        
        
    }
}
