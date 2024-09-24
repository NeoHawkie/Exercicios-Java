/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13.ex08;

/**
 *
 * @author Wallyson M. Lima
 */
public class aluno {
    String nome;
    int matricula;
    double[] notas = new double [3];
    
    public double calcularMedia(){
        double media = ((notas[0] + notas[1] + notas[2])/3);
        return media;
    }
}
