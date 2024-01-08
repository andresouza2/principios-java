package pessoa;

public class TesteDePessoa {
  public static void main(String[] args) {
    Professor professor = new Professor();

    professor.setNome("André");
    professor.setIdade(34);
    professor.setDocumento("123456789-00");
    professor.setSalario(5000);

    System.out.println(professor.imprimirDadosPessoa());

    Aluno aluno = new Aluno();

    aluno.setNome("João");
    aluno.setIdade(20);
    aluno.setDocumento("987654321-00");
    aluno.setMatricula("123456789");

    System.out.println(aluno.imprimirDadosPessoa());

  }
}
