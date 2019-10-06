package exercicio5;

/**
 *
 * @author Samuel
 */
public class Calculadora {
    // Métodos
    double soma(double a, double b){
        return a + b;
    }
    
    double subtracao(double a, double b){
        return a - b;
    }
    
    double multiplicacao(double a, double b){
        return a * b;
    }
    
    double divisao(double a, double b){
        return a / b;
    }
    
    double potenciacao(double base, double expoente){
        return Math.pow(base, expoente);
    }
    
    double raizQuadrada(double valor){
        return Math.sqrt(valor);
    }
}
