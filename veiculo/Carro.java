package veiculo;

public class Carro implements Veiculo {

  @Override
  public void acelerar() {
    System.out.println("acelerando o carro...\n");
  }

  @Override
  public void frear() {
    System.out.println("freando o carro...\n");
  }

}
