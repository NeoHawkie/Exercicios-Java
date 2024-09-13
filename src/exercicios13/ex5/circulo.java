/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13.ex5;

/**
 *
 * @author Wallyson Martins de Lima
 */
public class circulo {
    double raio;
    
    public double calcularArea(){
        return (Math.PI * (Math.pow(raio, 2)));
        // A = Pi*r²
    }
    
    public double calcularCircunferencia(){
        return (2 * Math.PI * raio);
        // C = 2*Pi*r
    }
}
