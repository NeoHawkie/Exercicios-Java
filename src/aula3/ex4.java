/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;
import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex4 {
    public static void main(String args[]){
        
        //calculo do imc 
        
        double imc, massa, altura;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Ola! Entre com o seu peso em kg: ");
        massa = scan.nextDouble();
        
        System.out.print("Agora entre com a sua altura: ");
        altura = scan.nextDouble();
        
        imc = massa / (Math.pow(altura,2));
        
        
        //para testes
        //imc = scan.nextDouble();
        
        System.out.print(String.format("\nSeu IMC e de %.2f\n", imc));
        
        if (imc < 17) {            
            System.out.print(("Muito abaixo do peso!\n"));
        } else if (imc < 18.5){
            System.out.print(("Abaixo do peso!\n"));
        } else if (imc < 25){
            System.out.print(("Peso ideal!\n"));
        }else if (imc < 30){
            System.out.print(("Sobrepeso!\n"));
        }else if (imc < 35){
            System.out.print(("Obesidade!\n"));
        }else if (imc < 40){
            System.out.print(("Obesidade severa!\n"));
        }else {
            System.out.print(("Obesidade morbida!\n"));
        }
    }   
}
