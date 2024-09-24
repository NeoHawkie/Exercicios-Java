/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex07;

/**
 *
 * @author Wallyson M. Lima
 */
public class circulo {
    double raio;

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public circulo(double raio) {
        this.raio = raio;
    }
    
    public double calcularArea(){
        return ((Math.PI)*(Math.pow(raio, 2)));
    }
    
    public double calcularCircunferencia(){
        return (2*(Math.PI)*raio);
    }
}
