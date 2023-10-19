package lista2;

import java.util.Scanner;

public class Exercicio15 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o tamanho do primeiro lado: ");
    float lado1 = scanner.nextFloat();
    System.out.print("Digite o tamanho do segundo lado: ");
    float lado2 = scanner.nextFloat();
    System.out.print("Digite o tamanho do terceiro lado: ");
    float lado3 = scanner.nextFloat();

    boolean ehTriangulo = false;
    String tipoTriangulo = "";

    if (lado1+lado2 > lado3 && lado1+lado3 > lado2 && lado2+lado3 > lado1) {
      ehTriangulo = true;
      if (lado1 == lado2 && lado1 == lado3) {
        tipoTriangulo = "equilátero";
      } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
        tipoTriangulo = "isósceles";
      } else {
        tipoTriangulo = "escaleno";
      }
    }

    if (ehTriangulo) {
      System.out.printf("É um triângulo %s", tipoTriangulo);
    } else {
      System.out.println("Não é um triângulo");
    }
  }

}
