/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios6.facil;
import java.util.ArrayList;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex02 {
    public static void main(String args[]){
        ArrayList<Integer> num = new ArrayList<>();
        
        //adiciono de 1 a 10;
        for (int i = 0; i < 10; i++) {
            num.add(i+1);
        }
        
        //remove se divisivel por 2
        for (int i = 0; i < num.size(); i++) {
            num.removeIf(x -> (x%2 ==0));
        }
        
        //imprime
        for (int i = 0; i < num.size(); i++) {
            System.out.println(num.get(i));
        }
    }
}
