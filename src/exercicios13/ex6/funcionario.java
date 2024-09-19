/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13.ex6;

/**
 *
 * @author Wallyson M. Lima
 */
public class funcionario {
    String nome, departamento;
    double salario;
    
    public void aumentarSalario(double percentual){
        salario = salario*((percentual/100)+1);
    }
}
