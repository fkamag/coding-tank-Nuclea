package lista2;

import java.util.Scanner;

public class Exercicio17 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um ano: ");
    int ano = scanner.nextInt();

    if (ano % 400 == 0) {
      System.out.println("Este ano é bissexto");
    } else if (ano % 100 == 0) {
      System.out.println("Este ano não é bissexto");
    } else if (ano % 4 == 0) {
      System.out.println("Este ano é bissexto");
    } else {
      System.out.println("Este ano não é bissexto");
    }
  }

}
