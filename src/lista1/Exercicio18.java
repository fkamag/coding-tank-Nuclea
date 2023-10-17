package lista1;

import java.util.Scanner;

public class Exercicio18 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o tamanho do arquivo em MB: ");
    float tamanhoArquivo = scanner.nextFloat();
    System.out.print("Digite a velocidade da conexão em Mbps: ");
    float velocidade = scanner.nextFloat();

    float tempo = (tamanhoArquivo / (velocidade / 8)) / 60;

    System.out.printf("O tempo aproximado é de %.0f minutos", tempo);

  }

}
