/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex07;

/**
 *
 * @author protected String
 */
public class Aluno extends Pessoa{
    private int matricula;
    public Aluno(String nome, String endereço, int idade, int matricula) {
        super(nome, endereço, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
