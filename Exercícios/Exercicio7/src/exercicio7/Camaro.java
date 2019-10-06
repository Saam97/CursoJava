package exercicio7;

/**
 *
 * @author Samuel
 */
public class Camaro extends Carro {

    public boolean tetoSolar;
    public boolean conversivel;

    // Exercício 8
    @Override
    public String toString() {
        return super.toString() + "\n\tCamaro{" + "tetoSolar=" + tetoSolar + ", conversivel=" + conversivel + '}';
    }
    
    
}
