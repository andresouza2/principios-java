/**
 * HelloWorld = Nome da classe
 * public = Tipo de acesso da classe
 * class = Tipo da classe
 */

public class HelloWorld {
  // todo o conteudo da classe deve estar dentro das chaves

  public static void main(String[] args) {
    // todo o conteudo do metodo deve estar dentro das chaves

    /**
     * Numeros (int, double, float, long)
     * Textos (String)
     * Booleanos (boolean)
     */

    int dadoDoTipoInt = 10;
    double dadoDoTipoDouble = 3.14;
    float dadoDoTipoFloat = 3.14f;
    long dadoDoTipoLong = 1000000000000000000L;
    String dadoDoTipoString = "Hello World!";
    boolean dadoDoTipoBoolean = true;

    // if - else
    // if (dadoDoTipoInt == 11) {
    // System.out.println("Entrou no if");
    // } else {
    // System.out.println("Entrou no else");
    // }

    // while
    // int valorInicial = 0;
    // while (valorInicial < 3) {
    // System.out.println("O valor inicial é maior que 3");
    // valorInicial++;
    // }

    // for
    for (int i = 0; i < 4; i++) {
      System.out.println("O valor de i é: " + i);
    }

    System.out.println("finalizou o programa!!!");

  }

}

// fora do escopo da classe