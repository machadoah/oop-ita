package curso6_PoliformismoLawOfDemeterExceptions.avaliacaoPares;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MecanicaSimplesTest {

    private MecanicaSimples mecanica;

    @BeforeEach
    public void setUp() {
        mecanica = new MecanicaSimples();
    }

    @Test
    public void testeVerificarTentativaCorreta() {
        mecanica.proximaPalavra(); // Define a palavra atual
        boolean acertou = mecanica.verificarTentativa("flamengo"); // Palavra atual é "flamengo"
        assertTrue(acertou);
        assertEquals(10, mecanica.getPontuacao());
    }

    @Test
    public void testeVerificarTentativaIncorreta() {
        mecanica.proximaPalavra(); // Define a palavra atual
        boolean acertou = mecanica.verificarTentativa("palmeiras"); // Palavra atual é outra
        assertFalse(acertou);
        assertEquals(0, mecanica.getPontuacao());
    }

    @Test
    public void testeFimDeJogo() {
        mecanica.verificarTentativa("cuiaba"); // 1ª tentativa
        mecanica.verificarTentativa("vasco");  // 2ª tentativa
        mecanica.verificarTentativa("bahia");  // 3ª tentativa, acabam as tentativas
        assertTrue(mecanica.isFimDeJogo());
    }

}