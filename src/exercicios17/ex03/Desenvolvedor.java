/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex03;

/**
 *
 * @author Wallyson M. Lima
 */
public class Desenvolvedor extends Funcionario{
    private String linguagemProgramacao;
    public Desenvolvedor(String nome, String cargo, double salario, String linguagemProgramacao) {
        super(nome, cargo, salario);
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public void setLinguagemProgramacao(String linguagemProgramacao) {
        this.linguagemProgramacao = linguagemProgramacao;
    }

    public String getLinguagemProgramacao() {
        return linguagemProgramacao;
    }
    
}
