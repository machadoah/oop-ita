package curso2_classesModelagem.avaliacaoPares;

class CarrinhoDeCompras {
    private static int total;

    public CarrinhoDeCompras() {
        total = 0;
    }

    public void adicionaPizza(Pizza pizza) {
        int preco = pizza.getPreco();
        if (preco > 0) {
            total += preco;
        }
    }

    public int getTotal() {
        return total;
    }
}



