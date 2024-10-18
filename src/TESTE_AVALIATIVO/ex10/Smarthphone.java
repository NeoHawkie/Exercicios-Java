/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex10;


/**
 *
 * @author Wallyson M. Lima
 */
public class Smarthphone extends DispositivoEletronico{
    private double tamanhoTela;
    public Smarthphone(String marca, String modelo, double tamanhoTela) {
        super(marca, modelo);
        this.tamanhoTela = tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }
    
}
/*
    O tablet possuí as caracteristicas do smartphone, que
    possuí as informações do dispositivo eletronico.
    Tablet herda tudo por tabela.
*/