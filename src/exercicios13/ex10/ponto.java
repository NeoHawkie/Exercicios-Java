/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13.ex10;

/**
 *
 * @author Wallyson M. Lima
 */
public class ponto {
    int x, y;
    
    public void calcularDistancia(ponto outroPonto){
        double D;
        D = Math.sqrt((Math.pow((x - outroPonto.x), 2) + (Math.pow((y - outroPonto.y), 2))));
        System.out.println("Distancia entre o ponto atual e o ponto inserido: " + D);
    }
    
}
