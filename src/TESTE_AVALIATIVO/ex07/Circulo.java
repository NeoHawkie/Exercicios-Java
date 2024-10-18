/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex07;

/**
 *
 * @author Wallyson M. Lima
 */
public class Circulo implements FiguraGeometrica{
    private double r;
    
    @Override
    public double calcularArea() {
        return (Math.PI*Math.pow(r, 2));
    }

    @Override
    public double calcularPerimetro() {
        return (2*Math.PI*r);
    }
    
}
