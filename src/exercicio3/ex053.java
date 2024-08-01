/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3;
import java.util.Scanner;

/**
 *
 * @author TI
 */
public class ex053 {
    public  static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        double idade[] = new double[5];
        String sexo[] = new String[5];
        int totM = 0, totF = 0, F20p = 0;
        double meditot = 0, mediM = 0;
        
        System.out.println("Entre com idade e sexo, respectivamente, para 5 pessoas:\n");
        for (int i = 0; i < 5; i++) {
            
            //coleto os dados
            idade[i] = scan.nextDouble();
            
            sexo[i] = scan2.nextLine().strip().toUpperCase();
            if ((!"M".equals(sexo[i])) && (!"F".equals(sexo[i]))) {
                System.out.println("ERRO");
                System.exit(0);
            }
            
            //organizo os dados coletados
            if (sexo[i].equals("M")){
                //quantos homens
                totM++;
                //media de idade dos homens
                mediM = mediM + idade[i];
            }else{
                //quantas mulheres
                totF++;
                
                //mulheres com + de 20 anos
                if (idade[i] > 20) {
                    F20p++;
                }
            }
            //somatorio de todas as idades para tirar a media
            meditot = meditot + idade[i];
        }
        //calculo a media total
        meditot = meditot/5;
        //calculo a media de idade dos homens
        mediM = mediM/totM;
        
        System.out.println(String.format("""
                                         Total de homens cadastrados: %d
                                         Total de mulheres cadastradas: %d
                                         Media de idade do grupo: %.2f
                                         Media de idade dos homens do grupo: %.2f
                                         Total de mulheres com mais de 20 anos: %d
                                         """, totM, totF, meditot, mediM, F20p));
        
    }
}