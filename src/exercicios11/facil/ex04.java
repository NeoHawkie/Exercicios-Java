/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios11.facil;
import java.util.Scanner;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex04 {
    public static double celsius2fahren(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entre com uma temperatura em Celsius: ");
        double num = input.nextDouble();
        System.out.println(num + "ºC equivale a " + celsius2fahren(num) + "ºF");
    }
}
