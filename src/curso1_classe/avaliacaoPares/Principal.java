package curso1_classe.avaliacaoPares;

public class Principal {

    public static void main(String[] args) {

        // Instanciação dos objetos
        Paciente p1 = new Paciente(100,1.90);
        Paciente p2 = new Paciente(70,1.75);
        Paciente p3 = new Paciente(180,2.19);

        // atribuição do diagnostico para uma outra variavel, para ficar mais modulado
        var diagnostico1 = p1.diagnostico();
        var diagnostico2 = p2.diagnostico();
        var diagnostico3 = p3.diagnostico();

        // Impressão dos diagnosticos
        System.out.println("O paciente 1 tem o seguinte diagnostico: " + diagnostico1);
        System.out.println("O paciente 2 tem o seguinte diagnostico: " + diagnostico2);
        System.out.println("O paciente 3 tem o seguinte diagnostico: " + diagnostico3);
    }

}
