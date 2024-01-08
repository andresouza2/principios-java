package veiculo;

public class Moto implements Veiculo {

  @Override
  public void acelerar() {
    System.out.println("acelerando a moto...\n");
  }

  @Override
  public void frear() {
    System.out.println("freando a moto...\n");
  }

}
