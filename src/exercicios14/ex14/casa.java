/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex14;
import exercicios14.ex01.pessoa;
/**
 *
 * @author Wallyson M. Lima
 */
public class casa {
    int numero;
    String cor;
    pessoa proprietario;

    public casa(int numero, String cor, pessoa proprietario) {
        this.numero = numero;
        this.cor = cor;
        this.proprietario = proprietario;
    }

    public int getNumero() {
        return numero;
    }

    public String getCor() {
        return cor;
    }

    public pessoa getProprietario() {
        return proprietario;
    }
    
    
}
