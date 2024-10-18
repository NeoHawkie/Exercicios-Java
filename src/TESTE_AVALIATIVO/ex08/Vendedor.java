/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex08;


/**
 *
 * @author Wallyson M. Lima
 */
public class Vendedor extends Funcionario{

    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void bonusSalarial() {
        this.setSalario(this.getSalario()*1.05); //setta 5% a mais do salário do vendedor.
        System.out.println(this.getNome() + " recebeu um bonus salarial.");
    }
    
}
