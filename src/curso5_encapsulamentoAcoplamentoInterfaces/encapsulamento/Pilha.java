package curso5_encapsulamentoAcoplamentoInterfaces.encapsulamento;

public class Pilha {

    private Object[] elementos;
    private int topo = 0;

    public Pilha(int maximo){
        elementos = new Object[maximo];
    }

    public void empilhar(Object elemento){
        elementos[topo] = elemento;
        topo++;
    }

    public Object desempilhar(){
        Object object = elementos[topo-1];
        topo--;
        return "Removido o elemento: " + object;
    }

    public Object topo(){
        return "O elemento do topo é: " + elementos[topo-1];
    }

    public int tamanho(){
        return topo;
    }

    public Object[] getElementos() {
        return elementos;
    }
}
