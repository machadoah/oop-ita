package curso4_heranca.aprofundandoEmHeranca.carros;

public class CarroSoma extends CarroCorrida{

    private int potencia;

    public CarroSoma(int potencia, int velocidadeMaxima, String nome) {
        super(velocidadeMaxima, nome);
        this.potencia = potencia;
    }

    public void acelerar(){
        this.velocidade += potencia;

        if(velocidade > velocidadeMaxima){
            velocidade = velocidadeMaxima;
        }
    }
}
