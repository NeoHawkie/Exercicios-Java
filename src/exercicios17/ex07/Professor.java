/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex07;

/**
 *
 * @author protected String
 */
public class Professor extends Pessoa{
    private String disciplina;
    public Professor(String nome, String endereço, int idade, String disciplina) {
        super(nome, endereço, idade);
        this.disciplina = disciplina; 
    }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
}
