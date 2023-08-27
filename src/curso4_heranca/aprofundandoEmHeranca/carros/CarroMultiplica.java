package curso4_heranca.aprofundandoEmHeranca.carros;

public class CarroMultiplica extends CarroCorrida{

    double potencia;
    public CarroMultiplica(int velocidadeMaxima, String nome, double potencia) {
        super(velocidadeMaxima, nome);

        if(potencia > 1 && potencia < 2 ){
            this.potencia = potencia;
        } else {
            this.potencia = 1.5;
        }
    }

    @Override
    public void acelerar() {

        if(velocidade == 0) {
            this.velocidade = 1;
        }

        this.velocidade *= potencia;

        if(velocidade > velocidadeMaxima)
            velocidade = velocidadeMaxima;
    }
}
