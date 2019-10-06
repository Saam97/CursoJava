package exercicio6;

/**
 *
 * @author Samuel
 */
public class Pirata {
    // Atributos
    private String nome;
    private double recompensa;
    private String tripulação;
    public static int contador = 0;
    
    // Construtor
    public Pirata(){
        contador++;
    }
    
    // Métodos
    public void conquistarTerras(){
        System.out.println("O " + this.nome + " se tornou dono de uma ilha");
    }
    
    public void mostrarDados(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Recompensa: $" + this.recompensa);
        System.out.println("Pertence a tripulação do " + this.tripulação);
    }
    
    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(double recompensa) {
        this.recompensa = recompensa;
    }

    public String getTripulação() {
        return tripulação;
    }

    public void setTripulação(String tripulação) {
        this.tripulação = tripulação;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Pirata.contador = contador;
    }
    
}
