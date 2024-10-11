/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex02;

/**
 *
 * @author Aluno
 */
public class Ave extends Animal{
    private double ComprimentoAsa;
    public Ave(String nome, int idade, double ComprimentoAsa) {
        super(nome, idade);
        this.ComprimentoAsa = ComprimentoAsa;
    }

    public void setComprimentoAsa(double ComprimentoAsa) {
        this.ComprimentoAsa = ComprimentoAsa;
    }

    public double getComprimentoAsa() {
        return ComprimentoAsa;
    }
    
}
