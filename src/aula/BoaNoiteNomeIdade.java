package aula;

import java.util.Scanner;

public class BoaNoiteNomeIdade {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Olá, qual o seu nome?");
    String nome = scanner.next();

    System.out.println("Qual o seu ano de nascimento?");
    int ano = scanner.nextInt();

    int idade = 2023 - ano;

    int idadeEm2025 = idade + 2;

    System.out.println("Boa noite, " + nome);
    System.out.println("No final de 2023 você terá " + idade + " anos.");
    System.out.println("No final de 2025 você terá " + idadeEm2025 + " anos.");
  }

}
