package pessoa;

public class Professor extends Pessoa {
    private double Salario;

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    // Sobreescrever o metodo
    String imprimirDadosDaPessoa() {
        System.out.println(super.imprimirDadosDaPessoa(2));
        return "Voce é professor";
    }
}
