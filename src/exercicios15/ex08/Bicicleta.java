/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex08;

/**
 *
 * @author Wallyson M. de Lima
 */
public class Bicicleta implements Veiculo{
    private boolean Pedalando;
    private String Lado;
    
    @Override
    public void acelerar() {
        Pedalando = true;
    }

    @Override
    public void frear() {
        Pedalando = false;
    }

    @Override
    public void virar(String direcao) {
        Lado = direcao;
    }
    
}
