package lista1;

import java.util.Scanner;

public class Exercicio16 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a quantidade de m² que precisa pintar: ");
    float area = scanner.nextInt();

    int qtdeLatas = 0;

    do {
      qtdeLatas ++;
    } while (qtdeLatas * 54 < area);

    float valorTotal = qtdeLatas * 80;

    System.out.println("A quantidade para atender a área é de " + qtdeLatas + " latas.");
    System.out.printf("O valor total é de R$ %.2f", valorTotal);

  }

}
