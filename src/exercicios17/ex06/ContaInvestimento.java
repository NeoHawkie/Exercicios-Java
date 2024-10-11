/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex06;

/**
 *
 * @author Aluno
 */
public class ContaInvestimento extends ContaBancaria{
    private String tipoInvestimento;
    public ContaInvestimento(String numConta, double saldo, String tipoInvestimento) {
        super(numConta, saldo);
        this.tipoInvestimento = tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }
    
}
