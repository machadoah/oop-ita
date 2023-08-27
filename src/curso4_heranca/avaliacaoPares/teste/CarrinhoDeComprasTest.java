package curso4_heranca.avaliacaoPares.teste;

import curso4_heranca.avaliacaoPares.producao.Produto;
import curso4_heranca.avaliacaoPares.producao.ProdutoComTamanho;
import curso4_heranca.avaliacaoPares.producao.CarrinhoDeCompras;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarrinhoDeComprasTest {

    @Test
    public void testAdicionaProdutoEValorTotal() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Produto produto1 = new Produto("Camiseta", "001", 19.99);
        Produto produto2 = new Produto("Calça", "002", 29.99);
        ProdutoComTamanho produto3 = new ProdutoComTamanho("Tênis", "003", 59.99, "42");

        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 1);
        carrinho.adicionaProduto(produto3, 1);

        double totalEsperado = (19.99 * 2) + 29.99 + 59.99;
        assertEquals(totalEsperado, carrinho.calcularValorTotal(), 0.01);
    }

    @Test
    public void testRemoveProduto() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Produto produto1 = new Produto("Camiseta", "001", 19.99);
        Produto produto2 = new Produto("Calça", "002", 29.99);
        ProdutoComTamanho produto3 = new ProdutoComTamanho("Tênis", "003", 59.99, "42");

        carrinho.adicionaProduto(produto1, 2);
        carrinho.adicionaProduto(produto2, 1);
        carrinho.adicionaProduto(produto3, 1);

        carrinho.removeProduto(produto1, 1);

        double totalEsperado = (19.99 * 1) + 29.99 + 59.99;
        assertEquals(totalEsperado, carrinho.calcularValorTotal(), 0.01);

        // Verifica que a quantidade de produto1 no carrinho foi reduzida para 1
        assertEquals(1, carrinho.getQuantidadeProduto(produto1));
    }
}

