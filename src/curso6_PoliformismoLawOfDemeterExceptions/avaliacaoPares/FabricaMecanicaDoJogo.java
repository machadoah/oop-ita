package curso6_PoliformismoLawOfDemeterExceptions.avaliacaoPares;

import java.util.ArrayList;
import java.util.List;

public class FabricaMecanicaDoJogo {
    private List<MecanicaDoJogo> mecanicas;

    public FabricaMecanicaDoJogo() {
        mecanicas = new ArrayList<>();
        // Adicione implementações de mecânicas de jogo aqui.
        mecanicas.add(new MecanicaSimples());
        mecanicas.add(new MecanicaDificil());
    }

    public MecanicaDoJogo getMecanicaDoJogo() {
        int indice = (int) (Math.random() * mecanicas.size());
        return mecanicas.get(indice);
    }
}
