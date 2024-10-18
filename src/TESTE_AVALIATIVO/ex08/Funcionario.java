/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex08;


/**
 *
 * @author Wallyson M. Lima
 */
public abstract class Funcionario {
    private String nome;
    private double salario;
    
    public abstract void bonusSalarial();
    
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
    Polimorfismo em java se refere a um método abstrato, com diversas "formas", que pode ser
    utilizado de uma forma para cada classe.
*/