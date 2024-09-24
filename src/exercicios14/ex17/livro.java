/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex17;

/**
 *
 * @author Wallyson M. Lima
 */
public class livro {
    String titulo, autor;
    int anoPublicacao;

    public livro(String titulo, String autor, int anoPublicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}
