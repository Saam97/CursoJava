package exercicio4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Samuel
 */
public class Exercicio4 {

    public static void main(String[] args) {
        // TODO code application logic here

        // Variável para entrada de dados
        Scanner teclado = new Scanner(System.in);

        // Casas da matriz
        int linha;
        int coluna;

        // Criando a matriz
        int[][] campoMinado = new int[2][2];

        // Criando a variável aleatória para gerar a bomba
        Random r = new Random();

        // Variáveis auxiliares:
        int bombaLinha = r.nextInt(2);
        int bombaColuna = r.nextInt(2);

        // Preenchendo a matriz com zeros, -1 é bomba
        for (int i = 0; i < campoMinado.length; i++) {
            for (int j = 0; j < campoMinado.length; j++) {
                campoMinado[i][j] = 0;
            }
        }

        // Adicionando a bomba
        campoMinado[bombaLinha][bombaColuna] = -1;

        // Variaveis auxiliares
        boolean vivo = true;
        int casasVisitadas = 0;

        // Loop
        while (vivo) {
            // Entrada de dados do usuário
            System.out.println("Para qual casa deseja andar?");
            System.out.println("Linha: ");
            linha = teclado.nextInt();
            System.out.println("Coluna");
            coluna = teclado.nextInt();

            // Pega o valor inserio e vai para o ponto na matriz
            int valorCasa = campoMinado[linha][coluna];

            // Se o ponto for igual a -1, Game Over
            if (valorCasa == -1) {
                System.err.println("VOCE PISOU NA BOMBA! GAME OVER");
                vivo = false;
            } else {    // Senão
                // Muda o valor do ponto visitado para 1
                campoMinado[linha][coluna] = 1;
                System.out.println("Voce pisou em um local seguro");

                // Verifica se passou em todos os pontos
                for (int i = 0; i < campoMinado.length; i++) {
                    for (int j = 0; j < campoMinado.length; j++) {
                        if (campoMinado[i][j] == 1) {
                            casasVisitadas++;   // Conta a casa como visitada
                        }
                        // Se o número de casas visitadas for igual a 3, voce zerou o jogo
                        if (casasVisitadas == 3) {
                            System.out.println("PARABÉNS! VOCÊ ZERO O JOGO !");
                            vivo = false;   // Sai do loop
                        }
                    }
                }
                casasVisitadas = 0;
            }

            System.out.println("");

        }
    }
}
