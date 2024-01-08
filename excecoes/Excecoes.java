package excecoes;

import pessoa.Pessoa;

public class Excecoes {

  // Checked exceptions

  // Unchecked exceptions

  /**
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) {
    // try {
    // validarNumero();
    // } catch (Exception e) {
    // System.out.println("Deu ruim");
    // e.printStackTrace();
    // }

    Pessoa p = null;
    p.getNome();

  }

  public static void validarNumero() throws Exception {
    int numero = 10;
    if (numero < 100) {
      throw new Exception("Error: numero é menor que 100");
    }
  }

}
