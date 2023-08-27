package curso3_TesteUmlColaboracaoDependencia.avaliacaoPares.classes;

import java.util.HashMap;
import java.util.Map;

public class Pizza {
    private static Map<String, Integer> ingredientes = new HashMap<>();

    public static void zerarRegistroIngredientes() {
        ingredientes.clear();
    }

    public void adicionaIngrediente(String ingrediente) {
        contabilizaIngrediente(ingrediente);
    }

    private static void contabilizaIngrediente(String ingrediente) {
        ingredientes.put(ingrediente, ingredientes.getOrDefault(ingrediente, 0) + 1);
    }

    public int getPreco() {
        int numIngredientes = ingredientes.values().stream().mapToInt(Integer::intValue).sum();

        if (numIngredientes <= 2) {
            return 15;
        } else if (numIngredientes <= 5) {
            return 20;
        } else {
            return 23;
        }
    }

    public static Integer getQuantidadeDeIngredientes(String ingrediente) {
        return ingredientes.getOrDefault(ingrediente, 0);
    }

    public static Map<String, Integer> getIngredientesRegistrados() {
        return new HashMap<>(ingredientes);
    }
}