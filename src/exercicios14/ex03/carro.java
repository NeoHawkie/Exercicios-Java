/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex03;

/**
 *
 * @author Wallyson M. Lima
 */
public class carro {
    String marca, modelo;
    int ano;
    boolean ligado;

    public carro(String marca, String modelo, int ano, boolean ligado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = ligado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public boolean isLigado() {
        return ligado;
    }
    
    public void ligar(){
        ligado = true;
    }
    
    public void desligar(){
        ligado = false;
    }
}
