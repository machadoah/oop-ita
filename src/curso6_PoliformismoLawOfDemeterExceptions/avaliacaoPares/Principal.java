package curso6_PoliformismoLawOfDemeterExceptions.avaliacaoPares;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FabricaMecanicaDoJogo fabricaMecanica = new FabricaMecanicaDoJogo();
        MecanicaDoJogo mecanica = fabricaMecanica.getMecanicaDoJogo();

        while (!mecanica.isFimDeJogo()) {
            String palavraEmbaralhada = mecanica.proximaPalavra();
            System.out.println("Tente adivinhar a palavra embaralhada: " + palavraEmbaralhada);
            String tentativa = in.nextLine();
            boolean acertou = mecanica.verificarTentativa(tentativa);
            if (acertou) {
                System.out.println("Parabéns, você acertou!");
            } else {
                System.out.println("Tente novamente.");
            }
        }

        System.out.println("Fim do jogo! Sua pontuação: " + mecanica.getPontuacao());
    }
}

