package primeirasAulas;

import java.util.HashSet;

public class ColecoesHashSet {
  public static void main(String[] args) {
    HashSet<Integer> numeros = new HashSet<>();
    numeros.add(10);
    numeros.add(11);
    numeros.add(12);

    // numeros.remove(12);

    // for (Integer elemento : numeros) {
    // System.out.println(elemento);
    // }

    System.out.println(numeros.contains(14));

  }
}