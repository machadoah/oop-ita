package curso3_TesteUmlColaboracaoDependencia.avaliacaoPares.teste;

import curso3_TesteUmlColaboracaoDependencia.avaliacaoPares.classes.Pizza;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;


class PizzaTest {

    @BeforeEach
    public void setUp() {
        Pizza.zerarRegistroIngredientes();
    }

    @Test
    public void testValorPizzaCom2Ingredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Ingrediente 1");
        pizza.adicionaIngrediente("Ingrediente 2");
        assertEquals(15, pizza.getPreco());
    }

    @Test
    public void testValorPizzaCom4Ingredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Ingrediente 1");
        pizza.adicionaIngrediente("Ingrediente 2");
        pizza.adicionaIngrediente("Ingrediente 3");
        pizza.adicionaIngrediente("Ingrediente 4");
        assertEquals(20, pizza.getPreco());
    }

    @Test
    public void testValorPizzaCom7Ingredientes() {
        Pizza pizza = new Pizza();
        pizza.adicionaIngrediente("Ingrediente 1");
        pizza.adicionaIngrediente("Ingrediente 2");
        pizza.adicionaIngrediente("Ingrediente 3");
        pizza.adicionaIngrediente("Ingrediente 4");
        pizza.adicionaIngrediente("Ingrediente 5");
        pizza.adicionaIngrediente("Ingrediente 6");
        pizza.adicionaIngrediente("Ingrediente 7");
        assertEquals(23, pizza.getPreco());
    }

    @Test
    public void testRegistroIngredientes() {
        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Ingrediente 1");
        pizza1.adicionaIngrediente("Ingrediente 2");
        pizza1.adicionaIngrediente("Ingrediente 3");

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Ingrediente 1");
        pizza2.adicionaIngrediente("Ingrediente 4");

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Ingrediente 1");
        pizza3.adicionaIngrediente("Ingrediente 2");
        pizza3.adicionaIngrediente("Ingrediente 5");

        assertEquals(3, Pizza.getQuantidadeDeIngredientes("Ingrediente 1").intValue());
        assertEquals(2, Pizza.getQuantidadeDeIngredientes("Ingrediente 2").intValue());
        assertEquals(1, Pizza.getQuantidadeDeIngredientes("Ingrediente 3").intValue());
        assertEquals(1, Pizza.getQuantidadeDeIngredientes("Ingrediente 4").intValue());
        assertEquals(1, Pizza.getQuantidadeDeIngredientes("Ingrediente 5").intValue());
    }

}