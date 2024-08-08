/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios5;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex57 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        ArrayList<String> funcionario = new ArrayList<>();
        ArrayList<String> nome = new ArrayList<>();
        ArrayList<Character> sexo = new ArrayList<>();
        ArrayList<Double> salario = new ArrayList<>();
        int i = 0;
        String continuar;
        
        System.out.println("------ CADASTRO DE FUNCIONARIOS ------");
        do {
            System.out.println("______________________________________");
            System.out.println("Nome: ");
            nome.add(input.nextLine().strip().toUpperCase());
            System.out.println("Sexo: ");
            sexo.add(input.nextLine().strip().toUpperCase().charAt(0));
            if (!sexo.get(i).equals("M".charAt(0)) && !sexo.get(i).equals("F".charAt(0))) {
                do {
                    System.out.println("!!! ENTRE COM 'M' OU 'F' !!!");
                    sexo.set(i, input.nextLine().strip().toUpperCase().charAt(0));
                } while (!sexo.get(i).equals("M".charAt(0)) && !sexo.get(i).equals("F".charAt(0)));
            }
            System.out.println("Salario: ");
            salario.add(input.nextDouble());
            System.out.println("______________________________________");
            i++;
            
            System.out.println("Deseja cadastrar mais um funcionario? (S/N)\n");
            continuar = input.nextLine().strip().; //DESGRAAAAAAAAAAAAAÇA
            System.out.println(continuar);
        } while ("S".equals(continuar));
    }
}
