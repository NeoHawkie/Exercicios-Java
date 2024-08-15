/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios06.facil;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex04 {
    public static void main(String args[]){
        ArrayList<String> cores = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com o nome de tres cores diferentes:");
        for (int i = 0; i < 3; i++) {
            cores.add(scan.nextLine().toLowerCase().strip()); //recebe o dado tudo minusculo e sem espaços no começo ou final
        }
        
        if (cores.contains("amarelo")) {
            System.out.println("Posso ver que voce inseriu a cor amarela!\n");
        }else{
            System.out.println("A cor amarela nao foi inserida.\n");
        }
    }
}
