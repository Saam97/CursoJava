package exercicio7;

/**
 *
 * @author Samuel
 */
public class Fusca extends Carro{

    public String estadoConservacao;
    public boolean radio;

    // Exercício 8

    @Override
    public String toString() {
        return super.toString() + "\n\tFusca{" + "estadoConservacao=" + estadoConservacao + ", radio=" + radio + '}';
    }
    
}
