package lista2;

import java.util.Scanner;

public class Exercicio27 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de morangos: ");
    double morango = scanner.nextDouble();
    System.out.print("Digite a quantidade de maçã: ");
    double maca = scanner.nextDouble();

    double valorBruto = 0;
    if (morango <= 5) {
      valorBruto += morango * 2.5;
    } else {
      valorBruto += morango * 2.2;
    }
    if (maca <= 5) {
      valorBruto += maca * 1.8;
    } else {
      valorBruto += maca * 1.5;
    }
    if (valorBruto > 25) {
      valorBruto -= (valorBruto * 0.1);
    }
    System.out.printf("Valor Total a pagar: R$ %.2f", valorBruto);
  }

}
