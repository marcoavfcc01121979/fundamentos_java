package veiculo;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veliculo carro = new Carro();
        Veliculo moto = new Moto();

        carro.Acelerar();
        carro.Frear();

        moto.Acelerar();
        moto.Frear();
    }
}
