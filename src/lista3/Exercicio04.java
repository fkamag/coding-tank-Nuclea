package lista3;

import java.util.Scanner;
import javax.sound.midi.Soundbank;

public class Exercicio04 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("População país A: ");
    double popA = scanner.nextDouble();
    System.out.print("Taxa de crescimento: ");
    double taxaA = scanner.nextDouble();
    System.out.print("População país B: ");
    double popB = scanner.nextDouble();
    System.out.print("Taxa de crescimento: ");
    double taxaB = scanner.nextDouble();

    int contador = 0;

    while (popA < popB) {
      popA = popA + (popA * taxaA/100);
      popB = popB + (popB * taxaB/100);
      contador++;
      System.out.printf("Ano %2d - %9.0f  -  %9.0f\n", contador, popA, popB);
    }
    System.out.printf("Vai levar %d anos para a população de A ultrapassar B", contador);
  }

}
