package curso2_classesModelagem.avaliacaoPares;

import java.util.HashMap;
import java.util.Map;

class Pizza {
    static Map<String, Integer> ingredientes = new HashMap<>();
    private int numIngredientes;

    public Pizza() {
        numIngredientes = 0;
    }

    public void adicionaIngrediente(String ingrediente) {
        contabilizaIngrediente(ingrediente);
        numIngredientes++;
    }

    private static void contabilizaIngrediente(String ingrediente) {
        if (ingredientes.containsKey(ingrediente)) {
            int quantidade = ingredientes.get(ingrediente);
            ingredientes.put(ingrediente, quantidade + 1);
        } else {
            ingredientes.put(ingrediente, 1);
        }
    }

    public int getPreco() {
        if (numIngredientes <= 2) {
            return 15;
        } else if (numIngredientes <= 5) {
            return 20;
        } else {
            return 23;
        }
    }
}