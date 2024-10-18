/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex25;

/**
 *
 * @author Wallyson M. Lima
 */
public abstract class FormaGeometrica {
    private double base, altura, raio;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public FormaGeometrica(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public abstract void calcularArea();
}
