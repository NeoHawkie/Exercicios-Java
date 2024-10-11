/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios17.ex02;

/**
 *
 * @author Wallyson M. Lima
 */
public class Main{
    
    public static void main(String[] args) {
        Reptil digimon = new Reptil("Agumon", 2, "Lisa");
        System.out.println("Nome: " + digimon.getNome()
                        + "\nIdade: " + digimon.getIdade()
                        + "\nTipo de escama: " + digimon.getTipoEscama());
    }
}
