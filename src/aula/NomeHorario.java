package aula;

import java.util.Scanner;

public class NomeHorario {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Qual o seu nome: ");
    String nome = scanner.next();

    System.out.print("Qual o horário agora? [apenas horas, sem os minutos]: ");
    int horario = scanner.nextInt();

    if (horario >= 4 && horario <= 11) {
      System.out.println("Bom dia, " + nome);
    } else if (horario >=12 && horario <=17) {
      System.out.println("Boa tarde, " + nome);
    } else if (horario >= 18 && horario <= 23 || horario >= 0 && horario <= 3) {
      System.out.println("Boa noite, " + nome);
    } else {
      System.out.println("Horário inválido");
    }
  }

}
