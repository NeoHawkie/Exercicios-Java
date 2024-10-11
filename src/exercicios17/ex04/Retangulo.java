/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex04;

/**
 *
 * @author Wallyson M. Lima
 */
public class Retangulo extends FormaGeometrica{
    private double base, altura;
    @Override
    protected double calcularArea() {
        return (base*altura);
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
}
