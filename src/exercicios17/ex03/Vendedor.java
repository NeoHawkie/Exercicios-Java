/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex03;

/**
 *
 * @author Wallyson M. Lima
 */
public class Vendedor extends Funcionario{
    private double comissao;
    public Vendedor(String nome, String cargo, double salario, double comissao) {
        super(nome, cargo, salario);
        this.comissao = comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }
    
}
