/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex03;

/**
 *
 * @author Wallyson M. Lima
 */
public class retangulo implements figuraGeometrica{
    private double L, A;
    
    @Override
    public double calcularArea() {
        return (L*A);
    }

    @Override
    public double calcularPerimetro() {
        return (2*(L+A));
    }
    
}
