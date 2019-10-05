package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Exercicio2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Classe para entrada de dados
        Scanner teclado = new Scanner(System.in);
        
        // Variáveis das notas
        double np1;
        double np2;
        
        // média final
        double npf;
        
        // Lendo os valores inseridos pelo usuario
        System.out.println("Digite a NP1:");
        np1 = teclado.nextDouble();
        System.out.println("Digite a NP2:");
        np2 = teclado.nextDouble();
        
        // Cálculo da média
        npf = (np1 + np2) / 2;
        
        System.out.println("A média do aluno é de :" + npf);
        
        
        if ( npf >= 60 ) {      // se a nota for maior que 60
            System.out.println("Aprovado");
        } else if (npf <= 30) { // Se a nota for menor que 30
            System.out.println("Reprovado");
        } else {                // Se a nota estiver entre 30 e 60
            System.out.println(" NP3 !!");
            
            // variável para a np3
            double np3;
            // Entrada de dados
            System.out.println("Digite o valor da NP3:");
            // Salvando na variável
            np3 = teclado.nextDouble();
            
            // Nova média
            npf = (npf + np3) / 2;
            
            System.out.println("A média final do aluno é: " + npf);
            
            if ( npf >= 50 ) {  // Se a média for maior que 50
                System.out.println("Aprovado na NP3");
            } else {            // Caso contrário
                System.out.println("Reprovado na NP3");
            }
        }
    }

}
