package curso5_encapsulamentoAcoplamentoInterfaces.interfaces;

public class Candidato implements Comparable<Candidato>{

    private int nota;
    private boolean pcd;
    private int idade;

    public Candidato(int nota, boolean pcd, int idade) {
        this.nota = nota;
        this.pcd = pcd;
        this.idade = idade;
    }

    public int getNota() {
        return nota;
    }

    public boolean isPcd() {
        return pcd;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public int compareTo(Candidato o) {
        if(this.getNota() == o.getNota()){
            if(this.isPcd() == o.isPcd()){

                return this.getIdade() - o.getIdade();

            } else {
                if(this.isPcd()){
                    return 1;
                } else {
                    return -1;
                }
            }
        } else {
            return this.getNota() - o.getNota();
        }
    }

    @Override
    public String toString() {
        return "[nota: %d ; deficiente: %b ; idade: %d]".formatted(this.getNota(), this.isPcd(), this.getIdade());
    }
}
