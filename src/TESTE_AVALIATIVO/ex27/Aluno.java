/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex27;

/**
 *
 * @author Wallyson M. Lima
 */
public class Aluno extends Pessoa{
    private int matricula;
    public Aluno(String nome, String endereço, int idade, int matricula) {
        super(nome, endereço, idade);
        this.matricula = matricula;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}

/*
    é util pois, como dito no exercicio anterior, a pessoa possuí dados padrões
    e o aluno extende esses dados ao pedir também a matricula ao iniciar uma variavel
    desta classe.
*/