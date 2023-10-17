package lista1;

import java.util.Scanner;

public class Exercicio04 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe as notas bimestrais");
    System.out.print("1º Bimestre: ");
    float bim1 = scanner.nextFloat();
    System.out.print("2º Bimestre: ");
    float bim2 = scanner.nextFloat();
    System.out.print("3º Bimestre: ");
    float bim3 = scanner.nextFloat();
    System.out.print("4º Bimestre: ");
    float bim4 = scanner.nextFloat();

    float media = (bim1 + bim2 + bim3 + bim4)/4;

    System.out.println("A média é " + media);
  }

}
