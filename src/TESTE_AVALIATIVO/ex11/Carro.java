/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex11;


/**
 *
 * @author Wallyson M. de Lima
 */
public class Carro implements Veiculo{
    private boolean Rodando;
    private String Lado;
    
    @Override
    public void acelerar() {
        Rodando = true;
    }

    @Override
    public void frear() {
        Rodando = false;
    }

    @Override
    public void virar(String direcao) {
        Lado = direcao;
    }
    
}
