package lista3;

import java.util.Scanner;

public class Exercicio26 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a quantidade de eleitores: ");
    int eleitores = scanner.nextInt();
    double voto;
    int candidatoA = 0;
    int candidatoB = 0;
    int candidatoC = 0;

    for (int i=1; i<=eleitores; i++) {
      voto = Math.ceil(Math.random()*3);
      if (voto == 1) {
        candidatoA++;
      } else if (voto == 2) {
        candidatoB++;
      } else {
        candidatoC++;
      }
    }
    System.out.printf("Votos Candidato A: %d\n", candidatoA);
    System.out.printf("Votos Candidato B: %d\n", candidatoB);
    System.out.printf("Votos Candidato C: %d\n", candidatoC);
  }

}
