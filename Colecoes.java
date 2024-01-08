import java.util.HashMap;
import java.util.Map;

public class Colecoes {

  public static void main(String[] args) {

    Map<String, Integer> notas = new HashMap<>();
    notas.put("André", 10);
    notas.put("Vini", 10);
    notas.put("Dani", 9);

    // var nota = notas.get("André");
    // System.out.println(nota);

    for (Map.Entry<String, Integer> entry : notas.entrySet()) {
      String key = entry.getKey();
      Integer value = entry.getValue();

      System.out.println("A chave é: \"" + key + "\" e o valor é: " + value);
    }
  }
}
