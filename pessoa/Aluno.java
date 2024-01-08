package pessoa;

public class Aluno extends Pessoa {

  private String matricula;

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public String getMatricula() {
    return matricula;
  }

  String imprimirDadosPessoa() {
    System.out.println(super.imprimirDadosPessoa());
    return "você é aluno \n";
  }

}
