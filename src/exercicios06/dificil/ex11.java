/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios06.dificil;
import java.util.Random;
import java.util.ArrayList;
import java.util.Objects;
/**
 *
 * @author Wallyson Martins de Lima
 */
public class ex11 {
    public static void main(String args[]){
        ArrayList<Integer> num = new ArrayList<>();
        Random rng = new Random();
        
        System.out.println("Preenchendo a lista com numeros:");
        for (int i = 0; i < 10; i++) {
            num.add(rng.nextInt(10)+1);
        }
        System.out.println(num.toString());
        
        //compara todos os elementos da lista entre si, e se o elemento
        //for igual, remove, sem deletar o elemento de um indice ao comparar
        // ele com ele mesmo:
        for (int i = 0; i < num.size(); i++) {
            for (int j = 0; j < num.size(); j++) {
                if (((num.get(i)).equals(num.get(j))) && (i != j)) {
                    num.remove(j);
                }
            }
        }
        
        System.out.println("\nLista de numeros sem duplicados:\n"+ num.toString());
    }
}
