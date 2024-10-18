/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex25;

/**
 *
 * @author Wallyson M. Lima
 */
public class Triangulo extends FormaGeometrica{

    private double AB, BC, CA;
    public Triangulo(double base, double altura, double AB, double BC, double CA) {
        super(base, altura);
        this.AB = AB;
        this.BC = BC;
        this.CA = CA;
    }

    @Override
    public void calcularArea() {
        System.out.println(String.format("Area: %.2f",
                            ((this.getAltura()*this.getBase())/2)));
    }
    
}

/*
    Se eu inserisse todas as variaveis possíveis de formas geometricas, ao utilizar uma classe
    como "triangulo", eu poderia utilizar um construtor especifico para puxar somente as informações
    uteis para um triangulo, sem precisar recriar o código.
*/