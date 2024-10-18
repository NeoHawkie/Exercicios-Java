/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex10;


/**
 *
 * @author Wallyson M. Lima
 */
public class DispositivoEletronico {
    protected String marca, modelo;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public DispositivoEletronico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }
}
/*
    O tablet possuí as caracteristicas do smartphone, que
    possuí as informações do dispositivo eletronico.
    Tablet herda tudo por tabela.
*/