/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.Veiculos;

/**
 *
 * @author Wallyson M. Lima
 */
public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Renault", "Kwid", 2020, 4);
        System.out.println("Marca: " + meuCarro.getMarca()
        + "\nModelo: " + meuCarro.getModelo()
        + "\nAno: " + meuCarro.getAno()
        + "\nNumero de portas: " + meuCarro.getNumPortas());
    }
}
