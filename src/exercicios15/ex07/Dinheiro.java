/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex07;

/**
 *
 * @author Wallyson M. de Lima
 */
public class Dinheiro implements FormaPagamento{
    private double Carteira;
    
    @Override
    public void efetuarPagamento(double valor) {
        if (Carteira >= valor) {
            System.out.println("Pagamento realizado.");
        }else{
            System.out.println("Faltou R$" + (valor - Carteira));
        }
    }
    
}
