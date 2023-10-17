package aula;

import java.util.Scanner;

public class BoaNoiteNome {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Olá, qual o seu nome?");
    String nome = scanner.next();

    System.out.println("Boa noite, " + nome);

  }

}
