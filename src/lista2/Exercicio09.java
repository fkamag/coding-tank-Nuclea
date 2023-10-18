package lista2;

import java.util.Scanner;

public class Exercicio09 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("1ª Cotação: ");
    float num1 = scanner.nextFloat();
    System.out.print("2ª Cotação: ");
    float num2 = scanner.nextFloat();
    System.out.print("3ª Cotação: ");
    float num3 = scanner.nextFloat();

    float menor = num1;
    float medio;
    float maior;

    if (num2 < menor) {
      menor = num2;
      medio = num1;
    } else {
      medio = num2;
    }
    if (num3 < medio) {
      if (num3 < menor) {
        maior = medio;
        medio = menor;
        menor = num3;
      } else {
        maior = medio;
        medio = num3;
      }
    } else {
      maior = num3;
    }

    System.out.printf("Ordem Crescente: %.2f - %.2f - %.2f", menor, medio, maior);
  }

}
