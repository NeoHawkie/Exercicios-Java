/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios14.ex10;

/**
 *
 * @author Wallyson M. Lima
 */
public class data {
    int dia, mes, ano;

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    public data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public String formatarData(){
        String dd, mm, aaaa;
        dd = Integer.toString(dia);
        mm = Integer.toString(mes);
        aaaa = Integer.toString(ano);
        return String.format("%S/%S/%S", dd, mm, aaaa);
    }
}
