package primeirasAulas;

import java.util.HashMap;
import java.util.Map;

public class Colecoes {

    public static void main(String[] args) {

        Map<String, Integer> notas = new HashMap<>();
        notas.put("Marco", 10);
        notas.put("Luis", 9);
        notas.put("Maria", 10);

        // var nota = notas.get("Marco");
        // System.out.println(nota);
        for (Map.Entry<String, Integer> entry : notas.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();

            System.out.println("A chave é " + key + "O valor é " + value);
        }
    }
}
