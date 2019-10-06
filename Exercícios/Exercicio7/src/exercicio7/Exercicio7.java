package exercicio7;

import java.util.ArrayList;

/**
 *
 * @author Samuel
 */
public class Exercicio7 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        // Exercicio 8
        ArrayList<Carro> concessionaria;
        
        concessionaria = new ArrayList<>();
        
        Camaro c = new Camaro();
        Fusca f = new Fusca();
        Gallardo g = new Gallardo();
        Uno u = new Uno();
        
        concessionaria.add(c);
        concessionaria.add(f);
        concessionaria.add(g);
        concessionaria.add(u);
        
        for (Carro carro : concessionaria) {
            System.out.println( carro.toString() );
        }
        
        
        
        
        
        
    }

}






