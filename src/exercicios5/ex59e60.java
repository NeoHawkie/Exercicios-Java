/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios5;

import java.util.ArrayList;
import java.util.Objects;
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
        ArrayList<String> tempString = new ArrayList<>();
        ArrayList<Character> sexo = new ArrayList<>();
        int temp = 0;
        ArrayList<Integer> idade = new ArrayList<>();
        ArrayList<Integer> tempInt = new ArrayList<>();
        int i = 0, totM=0;
        
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
        System.out.print("\nA pessoa mais velha cadastrada: ");
        tempInt.addAll(idade);
        tempInt.sort(null);
        for (int j = 0; j < tempInt.size(); j++) {
            if (Objects.equals(tempInt.getLast(), idade.get(j))) {
                temp = j;
            }
        }
        System.out.println(nome.get(temp) + " com "+ tempInt.getLast() + " anos.");
        tempInt.clear();
        
        //b1 e d2)
        System.out.print("\nQuantos homens foram cadastrados: ");
        i=0;
        temp=0;
        do {
            if (sexo.get(i) == 'M') {
                totM++;
                if (idade.get(i) > 30) {
                    temp++;
                }
            }
            i++;
        } while (i < sexo.size());
        System.out.print(totM);
        if (temp != 0) {
            System.out.println(", e " + temp + " tem mais de 30 anos.");
        }
        temp=0;        
        
        //c1 e b2)
        i=0;
        System.out.print("\nA idade da mulher mais jovem: ");
        do {
            if (sexo.get(i) == 'F') {
                tempInt.add(idade.get(i));
                tempString.add(nome.get(i));
            }
            i++;
        } while (sexo.size()-1 < i);
        i=0;
        int menor = tempInt.get(0), index=0;
        for (int j = 1; j < tempInt.size()-1; j++) {
            if (menor < tempInt.get(j)) {
                menor = tempInt.get(j);
                index = j;
            }
        }
        System.out.println(tempString.get(index) + " com " + menor + " anos.");
        tempInt.clear();
        tempString.clear();
        
//        do {
//            if (sexo.get(i).equals('F')) {
//                temp1.add(idade.get(i));
//            }
//            i++;
//        } while (i < sexo.size());
//        temp1.sort(null);
//        System.out.println(temp1.getFirst());
//        temp1.clear();
        
        
    }
}
