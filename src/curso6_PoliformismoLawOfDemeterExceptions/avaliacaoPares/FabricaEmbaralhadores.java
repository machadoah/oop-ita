package curso6_PoliformismoLawOfDemeterExceptions.avaliacaoPares;

import java.util.ArrayList;
import java.util.List;

public class FabricaEmbaralhadores {

    private List<Embaralhador> embaralhadores;

    public FabricaEmbaralhadores() {
        embaralhadores = new ArrayList<>();
        // Adicione implementações de embaralhadores aqui.
        embaralhadores.add(new EmbaralhadorSimples());
        embaralhadores.add(new EmbaralhadorInverter());
    }

    public Embaralhador getEmbaralhadorAleatorio() {
        int indice = (int) (Math.random() * embaralhadores.size());
        return embaralhadores.get(indice);
    }
}
