/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio01;
import java.util.Scanner;
/**
 *
 * @author TI
 */
public class ex008 {
    public static void main(String args[]){
        float m, km, cm, mm;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Entre com uma distancia em metros: ");
        m = scan.nextFloat();
        km = m/1000;
        cm = m*100;
        mm = m*1000;
        
        //printa as distancias
        System.out.print(String.format("""
                                       A distancia de %.2fM  corresponde a:
                                       %.2fKM
                                       %.2fCM
                                       %.2fMM
                                       """, m, km, cm, mm));
        
    }
}
