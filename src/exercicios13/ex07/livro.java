/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios13.ex07;

/**
 *
 * @author Wallyson M. Lima
 */
public class livro {
    String titulo, autor;
    int anoPublicacao;
    boolean disponivel;
    
    public void emprestar(){
        disponivel = false;
    }
    public void devolver(){
        disponivel = true;
    }
}
