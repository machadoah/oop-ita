package curso4_heranca.aprofundandoEmHeranca.carros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroMultiplicaTest {

    CarroCorrida carro;

    @BeforeEach
    public void inicializaCarro(){
        carro = new CarroMultiplica(100, "TESTE", 1.5);
    }

    @Test
    public void carroParado(){
        assertEquals(0, carro.getVelocidade());
    }

    @Test
    public void acelerar() {
        carro.acelerar();
        assertEquals(1.5, carro.getVelocidade());
    }

    @Test
    public void frear() {
        carro.acelerar();
        carro.acelerar();

        carro.frear();
        assertEquals(1.125, carro.getVelocidade());
    }

    @Test
    public void frearAteZero() {
        carro.acelerar();

        carro.frear();
        carro.frear();

        assertEquals(00, carro.getVelocidade());

    }
    @Test
    public void acelerarVelocidadeMaxima() {

        for (int i = 0; i < 14; i++) {
            carro.acelerar();
            carro.acelerar();
        }

        assertEquals(100, carro.getVelocidade());

    }
}