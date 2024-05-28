package conta;

public class ContaBancaria {

    private String numero;
    private String titular;
    private double saldo;

    // Getters e Setters

    // construtor
    public ContaBancaria() {
        saldo = 0.0;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    // depositar
    void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("O deposito de R$ " + valor + ". saldo atual R$ " + saldo);
        } else {
            System.out.println("O valor de déposito é inválido");
        }
    }

    // sacar
    void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + ". Saldo atual R$ " + saldo);
        }
    }
}
