package curso6_PoliformismoLawOfDemeterExceptions.avaliacaoPares;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmbaralhadorInverter implements Embaralhador{

    @Override
    public String embaralhar(String palavra) {
        // Lógica alternativa de embaralhamento.
        /*
        char[] chars = palavra.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - i - 1];
            chars[chars.length - i - 1] = temp;
        }
        return new String(chars);

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
