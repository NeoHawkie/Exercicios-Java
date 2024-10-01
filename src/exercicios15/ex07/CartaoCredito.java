/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex07;

/**
 *
 * @author Wallyson M. de Lima
 */
public class CartaoCredito implements FormaPagamento{
    private double Limite, Debito, Credito;
    //debito é o que se deve, crédito é o que se tem para uso, limite é o teto do crédito.
    
    @Override
    public void efetuarPagamento(double valor) {
        Credito = Limite - Debito;
        if (Credito >= valor) {
            Credito -= valor;
            Debito += valor;
        }else{
            System.out.println("Credito insuficiente!");
        }
    }
    
    public void Status(){ //fiz só pra me entender bem com a ideia do cartão...
        Credito = Limite - Debito;
        System.out.println("Limite total: R$" + Limite);
        System.out.println("Credito disponivel: R$" + Credito);
        System.out.println("Credito em uso: R$" + Debito);
    }
    
}
