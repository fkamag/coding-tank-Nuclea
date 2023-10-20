package lista3;

import java.util.Scanner;

public class Exercicio22 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();
    int contador = 0;

    for (int i=1; i <= numero; i++) {
      if (numero % i == 0) {
        contador++;
        System.out.printf("O número %d é divisível por %d\n", numero, i);
      }
    }
    if (contador > 2) {
      System.out.println("Esse número não é primo");
    } else {
      System.out.println("Esse número é primo");
    }
  }

}
