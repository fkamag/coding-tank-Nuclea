package lista1;

import java.util.Scanner;

public class Exercicio13 {

  public static void main(String[] args) {

    int tipo;
    float altura;
    double pesoIdeal;

    Scanner scanner = new Scanner(System.in);

    do {
      System.out.print("Digite 1 para Homem ou 2 para Mulher e 0 para Sair: ");
      tipo = scanner.nextInt();
      if (tipo == 0) {
        break;
      }
      System.out.print("Digite a sua altura em cm: ");
      altura = scanner.nextInt();
      altura = altura / 100;

      if (tipo == 1) {
        pesoIdeal = altura * 72.7 - 58;
      } else
        pesoIdeal = altura * 62.1 - 44.7;
      System.out.printf("O seu peso ideal é %.1f.%n", pesoIdeal);
    } while (tipo == 1 || tipo == 2);

      System.out.println("Obrigado por utilizar nosso serviço");

  }

}
