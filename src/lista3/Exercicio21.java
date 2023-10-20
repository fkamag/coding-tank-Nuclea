package lista3;

import java.util.Scanner;

public class Exercicio21 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();
    int contador = 0;

    for (int i=2; i <= numero; i++) {
      if (numero % i == 0) {
        contador++;
      }
    }
    if (contador > 1) {
      System.out.println("Esse número não é primo");
    } else {
      System.out.println("Esse número é primo");
    }
  }

}
