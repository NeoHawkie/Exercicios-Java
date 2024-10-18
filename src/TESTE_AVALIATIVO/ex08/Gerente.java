/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex08;
import java.util.Scanner;
/**
 *
 * @author Wallyson M. Lima
 */
public class Gerente extends Funcionario{

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void bonusSalarial() {
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com a porcentagem do aumento:");
        int porcentagem = input.nextInt();
        double multiplicador = (porcentagem/100)+1; //identifica um multiplicador
        double salarioFinal = this.getSalario()*multiplicador; //multiplica o salario atual pelo multiplicador
        this.setSalario(salarioFinal); //setta no salario do Gerente.
        System.out.println(this.getNome() + " recebeu um bonus salarial.");
    }
    
}
