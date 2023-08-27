package curso4_heranca.aprofundandoEmHeranca.carros;

import java.util.HashMap;
import java.util.Map;

public class Corrida {

    private int comprimentoPista;
    private Map<CarroCorrida, Integer> carros = new HashMap<>();

    public Corrida(int tamanho) {
        comprimentoPista = tamanho;
    }

    public void adiconaCarro(CarroCorrida cc) {
        carros.put(cc, 0);
    }

    private boolean terminou() {

        for (Integer valor : carros.values()) {
            if (valor >= comprimentoPista) {
                return true;
            }
        }
        return false;
    }

    public void largar() {

        while (!terminou()) {

            for (CarroCorrida cc : carros.keySet()) {
                cc.acelerar();

                int distanciaAtual = carros.get(cc);
                distanciaAtual += cc.getVelocidade();
                carros.put(cc, distanciaAtual);
            }
        }

        for (CarroCorrida cc : carros.keySet()) {

            System.out.printf("Carro: %s - Distância: %d\n",cc.getNome(), carros.get(cc));
        }


    }


}
