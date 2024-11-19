/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aulas.interfacegrafica;

/**
 *
 * @author Wallyson M. Lima
 */
public class ModelUsuario {
    protected int ID;
    protected String nome, senha;

    public ModelUsuario(int ID, String nome, String senha) {
        super();
        this.ID = ID;
        this.nome = nome;
        this.senha = senha;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
