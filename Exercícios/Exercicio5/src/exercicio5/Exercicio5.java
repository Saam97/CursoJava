package exercicio5;

import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Exercicio5 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Instanciando uma calculadora
        Calculadora c = new Calculadora();
        
        // Classe para entrada de dados
        Scanner teclado = new Scanner(System.in);
        
        // Valores
        int a;
        int b;
        
        // Entrada de dados
        System.out.println("Digite dois valores");
        a = teclado.nextInt();
        b = teclado.nextInt();
        
        // Saida de dados
        
        // Chamando o método diretamente na função Sout. Também é possivel armazenar em uma variável.
        System.out.println("Operações");
        System.out.println("Soma = " + c.soma(a, b));
        System.out.println("Subtração = " + c.subtracao(a, b));
        System.out.println("Divisão = " + c.divisao(a, b));
        System.out.println("Multiplicação = " + c.multiplicacao(a, b));
        System.out.println("Potenciação = " + c.potenciacao(a, b));
        System.out.println("Raiz Quadrada do primeiro numero = " + c.raizQuadrada(a));
        System.out.println("Raiz Quadrada do segundo numero = " + c.raizQuadrada(b));
        
    }

}
