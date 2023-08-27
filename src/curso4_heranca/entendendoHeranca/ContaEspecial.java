package curso4_heranca.entendendoHeranca;

public class ContaEspecial extends ContaCorrente {

    int limite;
    ContaEspecial(int limite){
        this.limite = limite;
    }

    @Override
    public boolean sacar(int valor) {

        if(valor > (saldo + limite)){
            return false;
        } else {
            saldo -= valor;
            return true;
        }

    }
}
