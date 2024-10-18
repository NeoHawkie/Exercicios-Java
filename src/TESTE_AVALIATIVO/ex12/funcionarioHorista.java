/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex12;


/**
 *
 * @author Wallyson M. Lima
 */
public class funcionarioHorista extends Funcionario{
    private final double salarioMensal = 1800;
    private int horasTrabalhadas;
    public funcionarioHorista(String nome, int horasTrabalhadas) {
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public void calcularSalario() {
        double salarioHora;
        salarioHora = salarioMensal/184; //184[horas em um mês util] == 23[dias uteis] * 8[horas uteis]
        this.setSalario(salarioHora*this.horasTrabalhadas);
        System.out.println(String.format(
                "Valor a ser pago por hora: R$ %.2f", this.getSalario()));
    }
}
