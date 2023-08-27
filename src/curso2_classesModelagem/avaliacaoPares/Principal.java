package curso2_classesModelagem.avaliacaoPares;

import java.util.Map;

public class Principal {

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        Pizza pizza1 = new Pizza();
        pizza1.adicionaIngrediente("Queijo");
        pizza1.adicionaIngrediente("Tomate");
        pizza1.adicionaIngrediente("Azeitona");
        carrinho.adicionaPizza(pizza1);

        Pizza pizza2 = new Pizza();
        pizza2.adicionaIngrediente("Queijo");
        pizza2.adicionaIngrediente("Presunto");
        carrinho.adicionaPizza(pizza2);

        Pizza pizza3 = new Pizza();
        pizza3.adicionaIngrediente("Queijo");
        pizza3.adicionaIngrediente("Calabresa");
        pizza3.adicionaIngrediente("Cebola");
        pizza3.adicionaIngrediente("Tomate");
        pizza3.adicionaIngrediente("Azeitona");
        carrinho.adicionaPizza(pizza3);

        System.out.println("Total do Carrinho de Compras: R$" + carrinho.getTotal());
        System.out.println("Quantidade utilizada de cada ingrediente:");
        for (Map.Entry<String, Integer> entry : Pizza.ingredientes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

