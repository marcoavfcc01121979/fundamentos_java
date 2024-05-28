package conta;

public class TesteContaBancaria {

    public static void main(String[] args) {

        ContaBancaria bancaria = new ContaBancaria();
        bancaria.setNumero("1234");
        bancaria.setTitular("Felipe");

        bancaria.depositar(65);
        bancaria.sacar(35);
    }
}
