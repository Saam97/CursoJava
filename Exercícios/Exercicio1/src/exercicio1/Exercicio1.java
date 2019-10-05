package exercicio1;

import java.util.Scanner;

/**
 * 
 * @author Samuel
 */
public class Exercicio1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Entrada de dados
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um número decimal");
        
        // Armazena a entrada de dados do usuário
        double valorEntrada = teclado.nextDouble();
        
        // Realizando o casting (conversão)
        int valorInteiro = (int) valorEntrada;
        
        // Saída de dados
        System.out.println("Valor decimal: " + valorEntrada);
        System.out.println("Valor inteiro: " + valorInteiro);
    }

}
