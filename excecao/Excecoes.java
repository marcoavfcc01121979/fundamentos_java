package excecao;

import pessoa.Pessoa;

public class Excecoes {

    // Checked exceptions

    // Unchecked exceptions

    public static void main(String[] args) {
        /*
         * try {
         * validarNumero();
         * } catch (Exception e) {
         * // TODO: handle exception
         * System.out.println("Deu ruim");
         * e.printStackTrace();
         * }
         */
        Pessoa pessoa = null;
        pessoa.getCpf();
    }

    public static void validarNumero() throws Exception {
        int numero = 10;
        if (numero < 100) {
            throw new Exception("O número é menor que 100");
        }
    }

}
