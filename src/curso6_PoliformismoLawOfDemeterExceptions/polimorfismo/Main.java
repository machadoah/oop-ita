package curso6_PoliformismoLawOfDemeterExceptions.polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void sons(List<Barulhento> lista){
        for(Barulhento b : lista){
            System.out.println(b.fazerBarulho());
        }
    }

    public static void main(String[] args) {

        List<Barulhento> barulhentos = new ArrayList<>();

        barulhentos.add(new Cachorro());
        barulhentos.add(new Carro());
        barulhentos.add(new Cachorro());
        barulhentos.add(new Bateria());
        barulhentos.add(new Carro());
        barulhentos.add(new Carro());
        barulhentos.add(new Carro());
        barulhentos.add(new Bateria());
        barulhentos.add(new Bateria());
        barulhentos.add(new Cachorro());

        sons(barulhentos);

    }

}
