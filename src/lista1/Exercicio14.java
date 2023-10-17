package lista1;

import java.util.Scanner;

public class Exercicio14 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de peixes em KG: ");
    float peso = scanner.nextFloat();

    if (peso > 50) {
      float excesso = peso - 50;
      float multa = excesso * 4;

      System.out.printf("O excesso de peso foi de %.3f Kg "
          + "e o valor da multa ficou em R$ %.2f", excesso, multa);
    }
  }

}
