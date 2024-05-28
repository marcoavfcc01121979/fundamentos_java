package primeirasAulas;

import java.util.ArrayList;
import java.util.List;

public class EstruturaDedados {

    public static void main(String[] args) {
        // Lista
        List<String> nomes = new ArrayList<>();
        nomes.add("Marco Ferreira");
        nomes.add("Luis Felipe");
        nomes.add("Maria Giulia");

        // System.out.println(nomes.get(0));
        // for (String nome : nomes) {
        // System.out.println("O nome é " + nome);
        // }

        // Ultilizando lambda
        nomes.forEach(nome -> System.out.println("O nome é " + nome));
    }
}
