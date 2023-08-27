package curso1_classe.avaliacaoPares;

public class Paciente {

    double peso;
    double altura;

    public Paciente(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    private double calculaIMC(){
        return (this.peso)/(Math.pow(this.altura, 2));
    }

    public String diagnostico(){

        if(this.calculaIMC() < 16.0) {
            return "Baixo peso muito grave";
        } else if(this.calculaIMC() >= 16 && this.calculaIMC() < 17){
            return "Baixo peso grave";
        } else if(this.calculaIMC() >= 17 && this.calculaIMC() < 18.50){
            return "Baixo peso";
        } else if(this.calculaIMC() >= 18.50 && this.calculaIMC() < 25){
            return "Peso normal";
        } else if(this.calculaIMC() >= 25 && this.calculaIMC() < 30){
            return "Sobrepeso";
        } else if (this.calculaIMC() >= 30 && this.calculaIMC() < 35) {
            return "Obesidade grau I";
        } else if (this.calculaIMC() >= 35 && this.calculaIMC() < 40) {
            return "Obesidade grau II";
        } else {
            return "Obesidade grau III (obesidade móbida)";
        }
    }
}
