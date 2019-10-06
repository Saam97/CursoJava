package exercicio7;

/**
 *
 * @author Samuel
 */
public abstract class Carro {

    // atributos
    protected String marca;
    protected String cor;
    protected int velocidadeMax;
    protected int numMarchas;
    protected double precoVenda;
    protected double precoCompra;
    protected int ano;
    
    // metodos
    public void calculaPrecoVenda(int anoModelo){
        
        if ( anoModelo <= 1980 ) {
            // 10%
            this.precoVenda = precoCompra + precoCompra * 0.10;
        } else if ( anoModelo <= 1990 ){
            // 15%
            this.precoVenda = precoCompra * 1.15;
        } else if ( anoModelo <= 2000 ){
            // 17,50%
            this.precoVenda = precoCompra * 1.175;
        } else if( anoModelo <= 2010 ){
            // 19%
            this.precoVenda = precoCompra * 1.19;
        } else if ( anoModelo <= 2020){
            // 25%
            this.precoVenda = precoCompra * 1.25;
        }
    }
    
    // Exercicio 8

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", cor=" + cor + ", velocidadeMax=" + velocidadeMax + ", numMarchas=" + numMarchas + ", precoVenda=" + precoVenda + ", precoCompra=" + precoCompra + ", ano=" + ano + '}';
    }
    
    
    
}
