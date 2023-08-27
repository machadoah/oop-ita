package curso1_classe.classeObjeto;

public class Carro {
    int potencia;
    int velocidade;
    String nome;

    public void acelerar(){
        velocidade += potencia;
    }

    public void frear(){
        velocidade /= 2;
    }

    public int getVelocidade() {
        return velocidade;
    }

    void imprimir(){
        System.out.println("""
                O carro %s está a velocidade de %d km/h
                """.formatted(nome, getVelocidade()));
    }
}
