/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TESTE_AVALIATIVO.ex28;

/**
 *
 * @author Wallyson M. Lima
 */
public class ContaInvestimento extends ContaBancaria{
    private String tipoInvestimento;
    public ContaInvestimento(String numConta, double saldo, String tipoInvestimento) {
        super(numConta, saldo);
        this.tipoInvestimento = tipoInvestimento;
    }

    public void setTipoInvestimento(String tipoInvestimento) {
        this.tipoInvestimento = tipoInvestimento;
    }

    public String getTipoInvestimento() {
        return tipoInvestimento;
    }
    
    public void percentualRendimento(){
        System.out.println(String.format("""
                                         Tipo de investimento: %s
                                         Percentual de rendimento: %.2f""",
                                        this.getTipoInvestimento(), 2.85) + "%.\n"); //taquei um nro aleatorio msmo
    }
    
}
