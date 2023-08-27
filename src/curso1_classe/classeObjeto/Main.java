package curso1_classe.classeObjeto;

public class Main {

    public static void main(String[] args) {

        Carro c1 = new Carro();
        c1.potencia = 10;
        c1.nome = "Corcel";


        Carro c2 = new Carro();
        c2.potencia = 20;
        c2.nome = "Fusca";

        Carro c3 = new Carro();
        c3.potencia = 10;
        c3.nome = "Corcel";


        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c1.frear();

        c1.imprimir();
        c2.imprimir();
        c3.imprimir();

    }
}
