package exercicio6;

/**
 *
 * @author Samuel
 */
public class Exercicio6 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Criando os piratas
        Pirata p1 = new Pirata();
        Pirata p2 = new Pirata();
        Pirata p3 = new Pirata();
        Pirata p4 = new Pirata();
        Pirata p5 = new Pirata();
        
        // Criando o array de piratas
        Pirata[] arrayPiratas = new Pirata[100];
        
        // Atribuindo valores
        p1.setNome("Pirata #1");
        p1.setRecompensa(559);
        p1.setTripulação("Barba Branca");
        
        p2.setNome("Pirata #2");
        p2.setRecompensa(995);
        p2.setTripulação("Ruivo");
        
        p3.setNome("Pirata #3");
        p3.setRecompensa(150);
        p3.setTripulação("Buggy");
        
        p4.setNome("Pirata #4");
        p4.setRecompensa(1050);
        p4.setTripulação("Chapéu de Palha");
        
        p5.setNome("Pirata #5");
        p5.setRecompensa(99999);
        p5.setTripulação("Barba Negra");
        
        // Adicionando no array
        arrayPiratas[0] = p1;
        arrayPiratas[1] = p2;
        arrayPiratas[2] = p3;
        arrayPiratas[3] = p4;
        arrayPiratas[4] = p5;
        
        // Variavel auxiliar
        double totalRecompensas = 0;
        
        // Percorrendo o array para calcular a recompensa total
        // e mostrando as informações
        for (int i = 0; i < Pirata.contador; i++) {
            arrayPiratas[i].mostrarDados();
            totalRecompensas = totalRecompensas + arrayPiratas[i].getRecompensa();
        }
        
        System.out.println("");
        System.out.println("Total de piratas = " + Pirata.contador);
        System.out.println("Total de recompensas = $" + totalRecompensas);
    }

}
