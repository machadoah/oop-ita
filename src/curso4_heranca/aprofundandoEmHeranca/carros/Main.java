package curso4_heranca.aprofundandoEmHeranca.carros;

public class Main {

    public static void main(String[] args) {

        Corrida corrida = new Corrida(2000);

        corrida.adiconaCarro(new CarroSoma(10, 100, "somadorA"));
        corrida.adiconaCarro(new CarroSoma(8, 140, "somadorB"));
        corrida.adiconaCarro(new CarroMultiplica(100, "multiplicadorA", 1.7));
        corrida.adiconaCarro(new CarroMultiplica(150, "multiplicadorB", 1.4));

        corrida.largar();
    }
}
