/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio02;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex024 {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        double distancia, preco;
        
        System.out.println("Entre com a distancia, em KM, em que o passageiro ira percorrer: ");
        distancia = scan.nextDouble();
        
        if (distancia < 200){
            preco = distancia*0.45;
            System.out.println(preco);
        }else{
            preco = 200*0.45;
            preco = (preco + ((distancia - 200)*0.5));
        }
        System.out.println(String.format("O valor da corrida sera R$%.2f", preco));
    }
}
