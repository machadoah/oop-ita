package curso6_PoliformismoLawOfDemeterExceptions.avaliacaoPares;

public class MecanicaSimples implements MecanicaDoJogo{
    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private String palavraAtual;
    private int pontuacao;
    private int tentativasRestantes;

    public MecanicaSimples() {
        bancoDePalavras = new BancoDePalavras();
        embaralhador = new EmbaralhadorSimples();
        pontuacao = 0;
        tentativasRestantes = 3;
    }

    @Override
    public boolean isFimDeJogo() {
        return tentativasRestantes <=0;
    }

    @Override
    public String proximaPalavra() {
        palavraAtual = bancoDePalavras.obterPalavraAleatoria();
        return embaralhador.embaralhar(palavraAtual);
    }

    @Override
    public boolean verificarTentativa(String tentativa) {
        if (palavraAtual.equalsIgnoreCase(tentativa)) {
            pontuacao += 10;
            tentativasRestantes = 3;
            return true;
        } else {
            tentativasRestantes--;
            return false;
        }
    }

    @Override
    public int getPontuacao() {
        return pontuacao;
    }
}
