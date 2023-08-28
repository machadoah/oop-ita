package curso5_encapsulamentoAcoplamentoInterfaces.avaliacaoPares.testes;

import curso5_encapsulamentoAcoplamentoInterfaces.avaliacaoPares.producao.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FommatadorNomeTest {

    @Test
    public void testFormatadorInformal() {
        FormatadorNome formatador = new InformalFormatadorNome();
        Autoridade autoridade = new Autoridade("João", "Silva", formatador);
        assertEquals("João", autoridade.getTratamento());
    }

    @Test
    public void testFormatadorRespeitosoMasculino() {
        FormatadorNome formatador = new RespeitosoFormatadorNome("masculino");
        Autoridade autoridade = new Autoridade("Maria", "Santos", formatador);
        assertEquals("Sr. Santos", autoridade.getTratamento());
    }

    @Test
    public void testFormatadorRespeitosoFeminino() {
        FormatadorNome formatador = new RespeitosoFormatadorNome("feminino");
        Autoridade autoridade = new Autoridade("Pedro", "Cabral", formatador);
        assertEquals("Sra. Cabral", autoridade.getTratamento());
    }

    @Test
    public void testFormatadorComTitulo() {
        FormatadorNome formatador = new ComTituloFormatadorNome("Magnífico");
        Autoridade autoridade = new Autoridade("Ana", "Sousa", formatador);
        assertEquals("Magnífico Ana Sousa", autoridade.getTratamento());
    }

}