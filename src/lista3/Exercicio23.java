package lista3;

import java.util.Scanner;

public class Exercicio23 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int numero = scanner.nextInt();
    int divisao = 0;
    System.out.println("Números primos: ");

    for (int x=2; x <= numero; x++) {
      int contador = 0;
      for (int i=2; i <= x; i++) {
        divisao++;
        if (x % i == 0) {
          contador++;
        }
      }
      if (contador == 1) {
        System.out.printf("- %d ", x);
      }

    }
    System.out.printf("\n Quantidade de divisões totais: %d", divisao);
  }

}
