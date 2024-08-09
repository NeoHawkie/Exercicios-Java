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
        Scanner input1 = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);
//      scanner buggando e não sei pq.....

        ArrayList<String> nome = new ArrayList<>();
        ArrayList<Character> sexo = new ArrayList<>();
        ArrayList<Double> salario = new ArrayList<>();
        int i = 0;
        String continuar;
        
        System.out.println("------ CADASTRO DE FUNCIONARIOS ------");
        do {
            System.out.println("______________________________________");
            System.out.println("Nome: ");
            nome.add(input1.nextLine().strip().toUpperCase());
            
            System.out.println("Sexo: ");
            sexo.add(input2.nextLine().strip().toUpperCase().charAt(0));
            if (!sexo.get(i).equals("M".charAt(0)) && !sexo.get(i).equals("F".charAt(0))) {
                do {
                    System.out.println("!!! ENTRE COM 'M' OU 'F' !!!");
                    sexo.set(i, input2.nextLine().strip().toUpperCase().charAt(0));
                } while (!sexo.get(i).equals("M".charAt(0)) && !sexo.get(i).equals("F".charAt(0)));
            }
            i++;
            
            System.out.println("Salario: ");
            salario.add(input3.nextDouble());
            System.out.println("______________________________________");
            
            System.out.println("Deseja cadastrar mais um funcionario? (S/N)\n");
            continuar = input.next().strip().toUpperCase();
            
        } while (continuar.startsWith("S"));
        i = 0;
        
        System.out.println("--------------------------------------");
        if ((nome.size() + sexo.size() + salario.size())/3 == nome.size()) {
            System.out.println("Funcionarios cadastrados com sucesso!");
        }else{
            System.out.println("!!! ERRO !!!");
            System.exit(0);
        }
        
        double SalTotM = 0, SalTotF = 0;
        do {
            if (sexo.get(i) == 'M') {
                SalTotM += salario.get(i);
            }else if (sexo.get(i) == 'F') {
                SalTotF += salario.get(i);
            }
            i++;
        } while (i != nome.size());
        
        System.out.println("\n--------------------------------------");
        System.out.println(String.format("""
                                         Salario total dos funcionarios
                                         do sexo masculino: %.2f
                                         
                                         Salario total das funcionarioas
                                         do sexo feminino: %.2f""", SalTotM, SalTotF));
        System.out.println("--------------------------------------");
        
    }
}
