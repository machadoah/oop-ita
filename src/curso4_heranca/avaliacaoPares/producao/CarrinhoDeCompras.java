package curso4_heranca.avaliacaoPares.producao;

import java.util.HashMap;

public class CarrinhoDeCompras {
    private HashMap<Produto, Integer> carrinho = new HashMap<>();

    public void adicionaProduto(Produto produto, int quantidade) {
        if (carrinho.containsKey(produto)) {
            int novaQuantidade = carrinho.get(produto) + quantidade;
            carrinho.put(produto, novaQuantidade);
        } else {
            carrinho.put(produto, quantidade);
        }
    }



    public void removeProduto(Produto produto, int quantidade) {
        if (carrinho.containsKey(produto)) {
            int quantidadeAtual = carrinho.get(produto);
            if (quantidade <= quantidadeAtual) {
                int novaQuantidade = quantidadeAtual - quantidade;
                if (novaQuantidade > 0) {
                    carrinho.put(produto, novaQuantidade);
                } else {
                    carrinho.remove(produto);
                }
            }
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        for (Produto produto : carrinho.keySet()) {
            int quantidade = carrinho.get(produto);
            total += produto.getPreco() * quantidade;
        }
        return total;
    }

    public int getQuantidadeProduto(Produto produto) {
        return carrinho.getOrDefault(produto, 0);
    }
}

