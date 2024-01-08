package pessoa;

public class Pessoa {

  private String nome;
  private int idade;
  private String documento;

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return nome;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getIdade() {
    return idade;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public String getDocumento() {
    return documento;
  }

  String imprimirDadosPessoa() {
    return "Nome: " + nome + " Idade: " + idade + " Documento: " + documento;
  }

}
