package curso5_encapsulamentoAcoplamentoInterfaces.avaliacaoPares.producao;

public class ComTituloFormatadorNome implements FormatadorNome {
    private String titulo;

    public ComTituloFormatadorNome(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        return titulo + " " + nome + " " + sobrenome;
    }
}

