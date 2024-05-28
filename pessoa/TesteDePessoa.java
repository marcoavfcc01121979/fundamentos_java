package pessoa;

public class TesteDePessoa {

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marco Ferreira");
        pessoa.setCpf("83556826372");
        pessoa.setIdade(44);

        System.out.println(pessoa.imprimirDadosDaPessoa(1));

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Luis Felipe");
        pessoa1.setCpf("123456789872");
        pessoa1.setIdade(9);

        System.out.println(pessoa1.imprimirDadosDaPessoa(2));

        Professor professor = new Professor();
        professor.setCpf("112233445566");
        professor.setIdade(21);
        professor.setNome("Marco");
        professor.setSalario(20000);
    }

}
