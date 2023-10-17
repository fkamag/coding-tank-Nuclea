package aula;

import java.util.Scanner;

public class IMC {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Informe sua altura em metros.");
    System.out.print("> ");
    float altura = scanner.nextFloat();

    System.out.println("Informe seu peso em Kg.");
    System.out.print("> ");
    int peso = scanner.nextInt();

    float imc = (float) peso / (altura * altura);

    System.out.printf("O valor do seu aula.IMC é %.2f", imc);
  }

}
