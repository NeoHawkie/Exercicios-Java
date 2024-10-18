/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex12;


/**
 *
 * @author Wallyson M. Lima
 */
public class funcionarioAssalariado extends Funcionario{
    private final double salarioMensal = 1800;
    public funcionarioAssalariado(String nome) {
        super(nome);
    }


    @Override
    public void calcularSalario() {
        this.setSalario(salarioMensal);
        System.out.println(String.format(
                "Valor a ser pago mensalmente: R$ %.2f", this.getSalario()));
    }
    
}
