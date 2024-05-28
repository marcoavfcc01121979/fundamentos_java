package pessoa;

public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // Sobreescrever o metodo
    String imprimirDadosDaPessoa() {
        // vai la na classe pai e tras tudo de la
        System.out.println(super.imprimirDadosDaPessoa(1));
        return "Voce é aluno";
    }
}
