package lista2;

import java.util.Scanner;

public class Exercicio10 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o seu turno M-matutino / V-Vespertino / N- Noturno: ");
    String turno = scanner.next();
    String mensagem;

    switch (turno) {
      case "M" -> mensagem = "Bom dia!";
      case "V" -> mensagem = "Boa Tarde!";
      case "N" -> mensagem = "Boa Noite!";
      default -> mensagem = "Valor Inválido!";
    }
    System.out.println(mensagem);
  }

}
