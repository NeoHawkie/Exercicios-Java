/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex12;

/**
 *
 * @author Wallyson M. Lima
 */
public class porta {
    boolean aberto;
    String cor;

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isAberto() {
        return aberto;
    }

    public String getCor() {
        return cor;
    }

    public porta(boolean aberto, String cor) {
        this.aberto = aberto;
        this.cor = cor;
    }
    
    public void abrir(){
        aberto = true;
    }
    
    public void fechar(){
        aberto = false;
    }
}
