/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex051 {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        double preco = 0, Mpreco = 0, mpreco = 0;
        
        System.out.println("Entre com o preco de venda de 8 produtos:\n");
        for (int i = 0; i < 8; i++) {
            preco = scan.nextDouble();
            if (preco > Mpreco){
                Mpreco = preco;
            }
            if ((mpreco == 0) || (preco < mpreco)) {
                mpreco = preco;
            }
        }
        System.out.println(String.format("""
                                         O menor preco foi %.2f
                                         O maior preco foi %.2f
                                         """, mpreco, Mpreco));
    }
}
