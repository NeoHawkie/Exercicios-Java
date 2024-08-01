/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;

/**
 *
 * @author TI
 */
public class ex043 {
    public static void main(String args[]){
        for (int i = 30; i > 0; i--) {
            if (i%4 == 0 ){
                System.out.println(String.format("[%d]", i));
            }else{
                System.out.println(i);
            }
        }
        System.out.println("Acabou!");
    }
}
