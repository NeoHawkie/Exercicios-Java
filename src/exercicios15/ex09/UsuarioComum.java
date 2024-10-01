/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicios15.ex09;

/**
 *
 * @author Wallyson M. Lima
 */
public class UsuarioComum implements ContaUsuario{

    @Override
    public void acessarSistema() {
        System.out.println("Entre com usuario e senha: ");//wip
    }

    @Override
    public void realizarOperacao() {
        System.out.println("ACESSO RESTRITO");
    }
    
}
