/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex025 {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        double ab, bc, ca;
        
        System.out.println("Entre com o valor de 3 retas para verificar se podem formar um triangulo:\n");
        ab = scan.nextDouble();
        bc = scan.nextDouble();
        ca = scan.nextDouble();
        
        if (((ab+bc) >= ca) && ((bc+ca) >= ab) && ((ca+ab) >= bc)){
            System.out.println("As retas 'a', 'b' e 'c' podem formar um triangulo!\n");
        }else{
            System.out.println("Estas retas nao podem formar um triangulo.\n");
        }
    }
}
