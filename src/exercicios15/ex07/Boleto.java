/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex07;

/**
 *
 * @author Wallyson M. de Lima
 */
public class Boleto implements FormaPagamento{
    private double ValorDoc;
    
    @Override
    public void efetuarPagamento(double valor) {
        ValorDoc = valor;
        System.out.println("Gerado boleto no valor de R$" + valor);
    }
    
}
