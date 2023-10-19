package lista2;

import java.util.Scanner;

public class Exercicio14 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    float nota1 = scanner.nextFloat();
    System.out.print("Digite a segunda nota: ");
    float nota2 = scanner.nextFloat();

    double media = (nota1 + nota2) / 2;
    String conceito;

    if (media >= 9) {
      conceito = "A";
    } else if (media >= 7.5) {
      conceito = "B";
    } else if (media >= 6) {
      conceito = "C";
    } else if (media >= 4) {
      conceito = "D";
    } else {
      conceito = "E";
    }

    String resultado;

    if (conceito.equals("A") || conceito.equals("B") || conceito.equals("C")) {
      resultado = "APROVADO";
    } else {
      resultado = "REPROVADO";
    }
    System.out.printf("Notas    : %.1f e %.1f\n", nota1, nota2);
    System.out.printf("Média    :      %.1f\n", media);
    System.out.printf("Conceito :      %s\n", conceito);
    System.out.printf("Resultado:   %s ", resultado);
  }

}
