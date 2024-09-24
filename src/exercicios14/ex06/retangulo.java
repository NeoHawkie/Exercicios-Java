/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex06;

/**
 *
 * @author Wallyson M. Lima
 */
public class retangulo {
    double largura, altura;

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }
    
    public double calcularArea(){
        return (largura*altura);
    }
    
    public double calcularPerimetro(){
        return (2*(largura+altura));
    }
}
