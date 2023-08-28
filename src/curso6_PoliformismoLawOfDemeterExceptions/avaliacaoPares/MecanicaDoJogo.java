package curso6_PoliformismoLawOfDemeterExceptions.avaliacaoPares;

public interface MecanicaDoJogo {
    boolean isFimDeJogo();
    String proximaPalavra();
    boolean verificarTentativa(String tentativa);
    int getPontuacao();
}

