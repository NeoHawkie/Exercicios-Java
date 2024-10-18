/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex06;

/**
 *
 * @author Wallyson M. Lima
 */
public class Livro {
    private String titulo, autor;
    private boolean disponivel;

    public void emprestarLivro(){
        this.disponivel = false;
    }
    
    public void devolverLivro(){
        this.disponivel = true;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }
}

/*
    A vantagem seria manter o valor armazenado seguro, sendo que a variavel não pode ser alterada
    diretamente, apenas a partir do seu método set;
*/