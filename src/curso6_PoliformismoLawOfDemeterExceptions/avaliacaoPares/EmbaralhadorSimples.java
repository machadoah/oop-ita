package curso6_PoliformismoLawOfDemeterExceptions.avaliacaoPares;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorSimples implements Embaralhador{
    @Override
    public String embaralhar(String palavra) {
        // Lógica simples de embaralhamento, como inverter a palavra.
        /*
        StringBuilder sb = new StringBuilder(palavra);
        return sb.reverse().toString();

         */
        List<String> letters = Arrays.asList(palavra.split(""));
        Collections.shuffle(letters);
        StringBuilder t = new StringBuilder(palavra.length());
        for (String k : letters) {
            t.append(k);
        }
        return t.toString();
    }
}
