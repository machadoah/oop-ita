package curso4_heranca.avaliacaoPares.teste;

import curso4_heranca.avaliacaoPares.producao.Produto;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProdutoTest {

    @Test
    public void testEqualsAndHashCode() {
        Produto produto1 = new Produto("Camiseta", "001", 19.99);
        Produto produto2 = new Produto("Calça", "002", 29.99);
        Produto produto3 = new Produto("Camiseta", "001", 19.99);

        // Verifica a igualdade entre produtos com o mesmo código
        assertTrue(produto1.equals(produto3));
        assertTrue(produto3.equals(produto1));
        assertEquals(produto1.hashCode(), produto3.hashCode());

        // Verifica a desigualdade entre produtos com códigos diferentes
        assertFalse(produto1.equals(produto2));
        assertFalse(produto2.equals(produto1));
    }
}

