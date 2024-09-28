/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex05;

/**
 *
 * @author Wallyson M. Lima
 */
public class funcionarioAssalariado implements pagavel{
    private double salario;

    @Override
    public void calcularPagamento() {
        System.out.println(String.format(
                "Valor a ser pago mensalmente: R$ %.2f", salario));
    }
    
}
