/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex07;

/**
 *
 * @author Wallyson M. Lima
 */
public class Retangulo implements FiguraGeometrica{
    private double base, altura;
    
    @Override
    public double calcularArea() {
        return (base*altura);
    }

    @Override
    public double calcularPerimetro() {
        return (2*(base+altura));
    }
    
}
