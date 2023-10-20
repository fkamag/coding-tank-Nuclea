package lista2;

import java.util.Scanner;

public class Exercicio21 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Qual o valor do saque: ");
    int saque = scanner.nextInt();
    int valorPago = 0;
    int valorRestante = saque;

    if (valorRestante >= 100) {
      int centena = valorRestante / 100;
      valorPago = 100 * centena;
      valorRestante -= valorPago;
      if (centena > 1) {
        System.out.printf("%d notas de 100\n", centena);
      } else {
        System.out.printf("%d nota de 100\n", centena);
      }
    }
    if (valorRestante >= 50) {
      int meiaCentena = valorRestante / 50;
      valorPago = 50 * meiaCentena;
      valorRestante -= valorPago;
      if (meiaCentena > 1) {
        System.out.printf("%d notas de 50\n", meiaCentena);
      } else {
        System.out.printf("%d nota de 50\n", meiaCentena);
      }
    }
    if (valorRestante >= 10) {
      int dezena = valorRestante / 10;
      valorPago = 10 * dezena;
      valorRestante -= valorPago;
      if (dezena > 1) {
        System.out.printf("%d notas de 10\n", dezena);
      } else {
        System.out.printf("%d nota de 10\n", dezena);
      }
    }
    if (valorRestante >= 5) {
      int meiaDezena = valorRestante / 5;
      valorPago = 5 * meiaDezena;
      valorRestante -= valorPago;
      if (meiaDezena > 1) {
        System.out.printf("%d notas de 5\n", meiaDezena);
      } else {
        System.out.printf("%d nota de 5\n", meiaDezena);
      }
    }
    if (valorRestante >= 1) {
      if (valorRestante > 1) {
        System.out.printf("%d notas de 1\n", valorRestante);
      } else {
        System.out.printf("%d nota de 1\n", valorRestante);
      }
    }
  }

}
