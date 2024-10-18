/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex22;

/**
 *
 * @author Wallyson M. Lima
 */
public class Circulo {
    private double r;
    
    public void calcularArea(){
        System.out.println(String.format("Area do circulo: %.2f", (r*Math.PI)));
    }
    public double calcularArea(double raio){
        return raio*Math.PI;
    }
}

/*
    Overload permite ter um método com o mesmo "nome" mas com atributos e/ou retornos diferentes;
*/