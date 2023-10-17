package lista2;

import java.util.Scanner;

public class Exercicio02 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    if (numero < 0) {
      System.out.println("Esse número é negativo");
    } else {
      System.out.println("Esse número é positivo");
    }
  }

}
