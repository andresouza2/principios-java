package conta;

public class TesteContaBancaria {
  public static void main(String[] args) {
    ContaBancaria conta1 = new ContaBancaria();

    conta1.depositar(100);
    conta1.sacar(2000);

    // System.out.println("Saldo atual: " + conta1.saldo);
  }
}
