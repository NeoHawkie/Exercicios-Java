/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex15;

/**
 *
 * @author Wallyson M. Lima
 */
public class PagamentoBoleto implements Pagamento{

    @Override
    public void efetuarPagamento() {
        System.out.println("Um boleto bancário será gerado e enviado para o seu e-mail.");
        //chega semana q vem, confia
    }
    
}
