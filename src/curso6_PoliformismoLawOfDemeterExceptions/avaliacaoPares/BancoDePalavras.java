package curso6_PoliformismoLawOfDemeterExceptions.avaliacaoPares;

import java.util.ArrayList;
import java.util.List;

public class BancoDePalavras {
    private List<String> palavras;

    public BancoDePalavras() {
        palavras = new ArrayList<>();
        palavras.add("flamengo");
        palavras.add("palmeiras");
        palavras.add("cuiaba");
        palavras.add("vasco");
        palavras.add("corinthians");
        palavras.add("bahia");
        palavras.add("barcelona");
        palavras.add("bayer");
        palavras.add("fluminense");
        palavras.add("gremio");
    }

    public String obterPalavraAleatoria() {
        int indice = (int) (Math.random() * palavras.size());
        return palavras.get(indice);
    }
}

