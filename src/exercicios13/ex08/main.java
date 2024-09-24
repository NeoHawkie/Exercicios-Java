/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13.ex08;

/**
 *
 * @author Wallyson M. Lima
 */
public class main {
    public static void main(String[] args) {
        aluno a1 = new aluno();
        a1.matricula = 456897123;
        a1.nome = "jorgin";
        a1.notas[0] = 5;
        a1.notas[1] = 5;
        a1.notas[2] = 5;
        
        double notafinal = a1.calcularMedia();
        System.out.println(notafinal);
    }
}
