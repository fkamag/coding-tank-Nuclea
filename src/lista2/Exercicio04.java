package lista2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite uma letra: ");

    String letra = scanner.next();

    String[] vogais = new String[]{"a", "e", "i", "o", "u"};

    List<String> lista = Arrays.asList(vogais);

    if (lista.contains(letra)) {
      System.out.println("A letra é uma vogal");
    } else {
      System.out.println("A letra é uma consoante");
    }
  }

}
