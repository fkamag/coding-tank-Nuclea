package lista2;

import java.util.Scanner;

public class Exercicio05 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    float nota1 = scanner.nextFloat();

    System.out.print("Digite a segunda nota: ");
    float nota2 = scanner.nextFloat();

    float media = (nota1 +  nota2) / 2;

    if (media == 10) {
      System.out.println("Aprovado com Distinção");
    } else if (media >= 7) {
      System.out.println("Aprovado");
    } else {
      System.out.println("Reprovado");
    }
  }

}
