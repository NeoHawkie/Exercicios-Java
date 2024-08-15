/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio03;

/**
 *
 * @author TI
 */
public class ex047 {
    public static void main(String args[]){
        int tot = 0;
        for (int i = 500; i >= 0; i = i - 50) {
            tot = tot + i;
        }
        System.out.println(tot);
    }
}
