package curso4_heranca.avaliacaoPares.teste;

import curso4_heranca.avaliacaoPares.producao.ProdutoComTamanho;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoComTamanhoTest {

    @Test
    public void testEqualsAndHashCode() {
        ProdutoComTamanho produto1 = new ProdutoComTamanho("Tênis", "003", 59.99, "42");
        ProdutoComTamanho produto2 = new ProdutoComTamanho("Tênis", "003", 59.99, "41");
        ProdutoComTamanho produto3 = new ProdutoComTamanho("Tênis", "003", 59.99, "42");

        // Verifica a igualdade entre produtos com o mesmo código e tamanho
        assertTrue(produto1.equals(produto3));
        assertTrue(produto3.equals(produto1));
        assertEquals(produto1.hashCode(), produto3.hashCode());

        // Verifica a desigualdade entre produtos com o mesmo código, mas tamanhos diferentes
        assertFalse(produto1.equals(produto2));
        assertFalse(produto2.equals(produto1));

        // Verifica a desigualdade entre produtos com códigos diferentes
        ProdutoComTamanho produto4 = new ProdutoComTamanho("Camiseta", "001", 19.99, "42");
        assertFalse(produto1.equals(produto4));
    }
}
