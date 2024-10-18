/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex23;

/**
 *
 * @author Wallyson M. Lima
 */
public class Funcionario implements Pagavel{
    
    private String nome;
    private double salario;
    
    @Override
    public void calcularPagamento() {
        this.setSalario(1800.00);
        System.out.println("Adicionado salario comercial.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    
}

/*
    Neste cenário, utilizar interfaces permite que as subclasses de Funcioario possam
    implementar o método calcularPagamento de forma especifica, tendo um calculo padrão para
    o funcionario padrão, ou modificando o calculo para os demais funcionarios.
*/