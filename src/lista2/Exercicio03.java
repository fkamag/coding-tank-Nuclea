package lista2;

import java.util.Scanner;

public class Exercicio03 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite 'F' para Feminino e 'M' para Masculino: ");
    var sexo = scanner.next();
    sexo = sexo.toUpperCase();

    if (sexo.equals("F")) {
      System.out.println("Feminino");
    } else if (sexo.equals("M")) {
      System.out.println("Masculino");
    } else {
      System.out.println("Sexo Inválido");
    }
  }

}
