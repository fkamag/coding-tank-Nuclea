package lista2;

import java.util.Scanner;

public class Exercicio08 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("1ª Cotação: ");
    float num1 = scanner.nextFloat();
    System.out.print("2ª Cotação: ");
    float num2 = scanner.nextFloat();
    System.out.print("3ª Cotação: ");
    float num3 = scanner.nextFloat();

    float menor = num1;

    if (num2 < menor) {
      menor = num2;
    }
    if (num3 < menor) {
      menor = num3;
    }

    System.out.printf("O menor preço é %.2f", menor);
  }

}
