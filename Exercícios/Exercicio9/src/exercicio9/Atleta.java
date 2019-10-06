package exercicio9;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuel
 */
public class Atleta extends Thread{

    // Atributos
    public String nome;
    public int distanciaPercorrida = 0;

    // Método que será executado quando a Thread começar
    @Override
    public void run() {
        // Variável randomica auxiliar
        Random r = new Random();
        
        // Enquanto ele não cruzar a linha de chegada (em 100 metros)
        while ( distanciaPercorrida < 100 ) {
            // Gera um numero aleatorio entre 0 e 10
            int valor = r.nextInt(11);
            // Incrementa na distancia percorrida
            distanciaPercorrida += valor;
            // Delay para podermos ver os atletas correndo
            try {
                Thread.sleep(150); // 150 ms 
                System.out.println(this.nome + " está em " + distanciaPercorrida + " m");
            } catch (InterruptedException ex) {
                System.out.println("Deu ruim na Thread!");
            }
        }
        // Chegou !
        System.err.println("O " + this.nome + " cruzou a linha de chegada!!");
    }
    
    
}
