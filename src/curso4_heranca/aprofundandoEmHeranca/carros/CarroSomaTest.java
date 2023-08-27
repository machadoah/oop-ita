package curso4_heranca.aprofundandoEmHeranca.carros;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarroSomaTest {

    CarroCorrida carro;

    @BeforeEach
    public void inicializaCarro(){
        carro = new CarroSoma(10, 100, "teste");
    }

    @Test
    public void carroParado(){
        assertEquals(00, carro.getVelocidade());
    }

    @Test
    public void acelerar() {
        carro.acelerar();
        assertEquals(10, carro.getVelocidade());
    }

    @Test
    public void frear() {
        carro.acelerar();
        carro.frear();
        assertEquals(5, carro.getVelocidade());
    }

    @Test
    public void frearAteZero() {
        carro.acelerar();
        carro.frear();
        carro.frear();
        carro.frear();
        carro.frear();

        assertEquals(00, carro.getVelocidade());

    }
    @Test
    public void acelerarVelocidadeMaxima() {

        for (int i = 0; i < 14; i++) {
            carro.acelerar();
        }

        assertEquals(100, carro.getVelocidade());

    }
}