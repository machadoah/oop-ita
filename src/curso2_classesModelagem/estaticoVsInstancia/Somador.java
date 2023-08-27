package curso2_classesModelagem.estaticoVsInstancia;

public class Somador {

    String nome;
    int valorInstancia = 0;
    static int valorEstatica = 0;

    void somar(){
        this.valorInstancia++;
        Somador.valorEstatica++;
    }

    void imprimir(){
        System.out.println("""
                Variável Estática do %s = %d
                Variável Instância = %d
                """.formatted(this.nome,Somador.valorEstatica, this.valorInstancia));
    }

}
