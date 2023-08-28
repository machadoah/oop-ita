package curso5_encapsulamentoAcoplamentoInterfaces.avaliacaoPares.producao;

public class RespeitosoFormatadorNome implements FormatadorNome{

    private String genero;

    public RespeitosoFormatadorNome(String genero) {
        this.genero = genero;
    }

    @Override
    public String formatarNome(String nome, String sobrenome) {
        if ("masculino".equalsIgnoreCase(genero)) {
            return "Sr. " + sobrenome;
        } else if ("feminino".equalsIgnoreCase(genero)) {
            return "Sra. " + sobrenome;
        } else {
            return sobrenome; // Tratamento padrão
        }
    }
}
