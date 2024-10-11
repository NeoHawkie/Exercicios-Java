/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex03;

/**
 *
 * @author Wallyson M. Lima
 */
public class Gerente extends Funcionario{
    private String departamento;
    public Gerente(String nome, String cargo, double salario, String departamento) {
        super(nome, cargo, salario);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    
}
