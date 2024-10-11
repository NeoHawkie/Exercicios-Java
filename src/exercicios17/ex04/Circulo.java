/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex04;

/**
 *
 * @author Wallyson M. Lima
 */
public class Circulo extends FormaGeometrica{
    private double r;
    
    @Override
    protected double calcularArea() {
        return (Math.PI * Math.pow(r, 2));
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public Circulo(double r) {
        this.r = r;
    }
    
}
