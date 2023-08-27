package curso4_heranca.aprofundandoEmHeranca.carros;

public abstract class CarroCorrida {

    protected double velocidade;
    protected double velocidadeMaxima;
    protected String nome;

    public CarroCorrida(int velocidadeMaxima, String nome) {
        this.velocidadeMaxima = velocidadeMaxima;
        this.nome = nome;
        this.velocidade = 0;
    }

    public abstract void acelerar();

    public void frear(){
        this.velocidade /= 2;

        if(velocidade < 1){
            this.velocidade = 0;
        }

    }

    public double getVelocidade() {
        return velocidade;
    }

    public String getNome() {
        return nome;
    }
}
