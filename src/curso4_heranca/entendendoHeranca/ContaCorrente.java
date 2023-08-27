package curso4_heranca.entendendoHeranca;

public class ContaCorrente {

    int saldo;

    public boolean sacar(int valor){
        if(valor > saldo) {
            return false;
        } else {
            saldo -= valor;
            return true;
        }
    }

    public void depositar(int valor){
        saldo += valor;
    }

}
