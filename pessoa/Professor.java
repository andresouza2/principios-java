package pessoa;

public class Professor extends Pessoa {

  private double salario;

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public double getSalario() {
    return salario;
  }

  // Sobrescreveu o metodo de Pessoa, ou seja da classe pai
  String imprimirDadosPessoa() {
    System.out.println(super.imprimirDadosPessoa());
    return "você é professor \n";
  }

}
