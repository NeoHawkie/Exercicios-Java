/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios16.ex01;

/**
 *
 * @author Wallyson M. Lima
 */
public class Retangulo extends Forma{
    private double base, altura;
    
    @Override
    public double calcularArea() {
        return (base * altura);
    }
    
}
