package curso5_encapsulamentoAcoplamentoInterfaces.avaliacaoPares.producao;

public class InformalFormatadorNome implements FormatadorNome {
    @Override
    public String formatarNome(String nome, String sobrenome) {
        return nome;
    }
}

