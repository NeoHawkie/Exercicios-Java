/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex02;

/**
 *
 * @author Aluno
 */
public class Reptil extends Animal{
    private String tipoEscama;
    public Reptil(String nome, int idade, String tipoEscama) {
        super(nome, idade);
        this.tipoEscama = tipoEscama;
    }

    public String getTipoEscama() {
        return tipoEscama;
    }

    public void setTipoEscama(String tipoEscama) {
        this.tipoEscama = tipoEscama;
    }
    
}
