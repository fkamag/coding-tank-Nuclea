package lista2;

import java.util.Scanner;

public class Exercicio13 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número conforme o dia [1-Domingo, 2-Segunda...: ");
    int numero = scanner.nextInt();
    String dia;

    switch (numero) {
      case 1:
        dia = "Domingo";
        break;
      case 2:
        dia = "Segunda";
        break;
      case 3:
        dia = "Terça";
        break;
      case 4:
        dia = "Quarta";
        break;
      case 5:
        dia = "Quinta";
        break;
      case 6:
        dia = "Sexta";
        break;
      case 7:
        dia = "Sábado";
        break;
      default:
        dia = "valor inválido";
        break;
    }
    System.out.println(dia);
  }

}
