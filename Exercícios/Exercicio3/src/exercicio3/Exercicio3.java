package exercicio3;

/**
 *
 * @author Samuel
 */
public class Exercicio3 {
    
    public static void main(String[] args) {
        // TODO code application logic here

        // Um número é primo se ele for divisível por apenas 1 e ele mesmo.
        // A logica desenvolvida é: caso o número não for divisível pelos
        // Numeros no enunciado, ele é primo. Portanto temos:
        
        // Um for para percorrer todos os valores de 1 até 50
        for (int i = 0; i < 50; i++) {
            // Casos especiais: números 2, 3, 5 e 7.
            if (i == 2 || i == 3) {
                System.out.println(i);
            }
            if (i == 5 || i == 7) {
                System.out.println(i);
            }
            // Agora podemos ter um if encadeado ou não.
            // Se o resto da divisão for diferente de zero, quer dizer que o número não
            // É divisível por aquele denominador.
            if ( i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
