package curso3_TesteUmlColaboracaoDependencia.avaliacaoPares.teste;

import curso3_TesteUmlColaboracaoDependencia.avaliacaoPares.classes.CarrinhoDeCompras;
import curso3_TesteUmlColaboracaoDependencia.avaliacaoPares.classes.Pizza;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarrinhoDeComprasTest {

    @Test
    public void testPrecoTotalPizzas() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Ingrediente 1");
        pizza1.adicionaIngrediente("Ingrediente 2");
        carrinho.adicionaPizza(pizza1);

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Ingrediente 1");
        pizza2.adicionaIngrediente("Ingrediente 3");
        pizza2.adicionaIngrediente("Ingrediente 4");
        carrinho.adicionaPizza(pizza2);

        assertEquals(35, carrinho.getTotal());
    }

    @Test
    public void testAdicionaPizzaSemIngredientes() {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Pizza pizza = new Pizza(); // Pizza sem ingredientes
        carrinho.adicionaPizza(pizza); // Deve lançar uma exceção
    }

}