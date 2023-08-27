package curso1_classe.construtores;

public class Compra {

    int valorTotal;
    int numeroParcelas;

    // Compra a vista
    public Compra(int valorTotal) {
        this.valorTotal = valorTotal;
        this.numeroParcelas = 1;
    }

    // Compra parcelada
    public Compra(int valorParcela, int numeroParcelas) {
        this.numeroParcelas = numeroParcelas;
        this.valorTotal = valorParcela * numeroParcelas;
    }

    public int getValorTotal() {
        return valorTotal;
    }

    public int getNumeroParcelas() {
        return numeroParcelas;
    }

    public int getValorParcela(){
        return getValorTotal()/getNumeroParcelas();
    }
}
