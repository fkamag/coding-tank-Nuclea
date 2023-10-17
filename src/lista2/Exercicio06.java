package lista2;

import java.util.Scanner;

public class Exercicio06 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o primeiro número: ");
    int num1 = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int num2 = scanner.nextInt();
    System.out.print("Digite o terceiro número: ");
    int num3 = scanner.nextInt();

    int maior = 0;

    if (num1 > maior) {
      maior = num1;
    }
    if (num2 > maior) {
      maior = num2;
    }
    if (num3 > maior) {
      maior = num3;
    }

    System.out.println("O maior número é " + maior);
  }

}
