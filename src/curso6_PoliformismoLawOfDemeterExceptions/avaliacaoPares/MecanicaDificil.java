package curso6_PoliformismoLawOfDemeterExceptions.avaliacaoPares;

public class MecanicaDificil implements MecanicaDoJogo{

    private BancoDePalavras bancoDePalavras;
    private Embaralhador embaralhador;
    private String palavraAtual;
    private int pontuacao;
    private int tentativasRestantes;

    public MecanicaDificil() {
        bancoDePalavras = new BancoDePalavras();
        embaralhador = new EmbaralhadorInverter(); // Embaralhador mais difícil.
        pontuacao = 0;
        tentativasRestantes = 2; // Menos tentativas para maior dificuldade.
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
            pontuacao += 15; // Mais pontos para maior dificuldade.
            tentativasRestantes = 2; // Reset de tentativas.
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
