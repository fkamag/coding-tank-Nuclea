package exame;

import java.util.Scanner;

public class ConversorDeTemperaturas {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe a temperatura:");
    double temperatura = scanner.nextDouble();

    System.out.println("Qual a unidade de origem dessa temperatura? [C, K, F]");
    String unidade = scanner.next();

    if (!unidade.equals("C") && !unidade.equals("K") && !unidade.equals("F")) {
      System.out.println("Entrada não válida");
    } else {
      System.out.println("Qual a unidade de destino dessa temperatura? [C, K, F]");
      String unidadeDestino = scanner.next();

      if (!unidadeDestino.equals("C") && !unidadeDestino.equals("K") && !unidadeDestino.equals("F")) {
        System.out.println("Entrada não válida");
      } else {
        double result;
        if (unidade.equals("C")) {
          if (unidadeDestino.equals("F")) {
            result = (temperatura * 9 / 5) + 32;
          } else {
            result = temperatura + 273.15;
          }
        } else if (unidade.equals("F")) {
          if (unidadeDestino.equals("C")) {
            result = (temperatura - 32) * 5 / 9;
          } else {
            result = (temperatura - 32) * 5 / 9 + 273.15;
          }
        } else {
          if (unidadeDestino.equals("C")) {
            result = temperatura - 273.15;
          } else {
            result = (temperatura - 273.15) * 9 / 5 + 32;
          }
        }
        System.out.printf("%.2f %s = %.2f %s", temperatura, unidade, result, unidadeDestino);
      }
    }
  }
}
