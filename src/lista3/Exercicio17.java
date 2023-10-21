package lista3;

import java.util.Scanner;

public class Exercicio17 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Cálculo de Fatorial. Digite um número: ");
    int numero = scanner.nextInt();
    String mensagem = numero + "!=";
    int total = 1;

    for (int i = numero; i >= 2; i--) {
      total *= i;
      mensagem += i + ".";
    }
    mensagem += "1=" + total;
    System.out.println(mensagem);
  }

}
