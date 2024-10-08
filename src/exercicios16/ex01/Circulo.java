/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios16.ex01;

/**
 *
 * @author Wallyson M. Lima
 */
public class Circulo extends Forma{    
    private double r;
    
    @Override
    public double calcularArea() {
        return (Math.PI * Math.pow(r, 2));
    }
}
