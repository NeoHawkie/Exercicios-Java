/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex07;

/**
 *
 * @author Wallyson M. Lima
 */
public class Funcionario extends Pessoa{
    private String cargo;
    public Funcionario(String nome, String endereço, int idade, String cargo) {
        super(nome, endereço, idade);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
}
