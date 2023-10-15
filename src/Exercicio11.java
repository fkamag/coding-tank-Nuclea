import java.util.Scanner;

public class Exercicio11 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número inteiro: ");
    int num1 = scanner.nextInt();

    System.out.print("Digite outro número inteiro: ");
    int num2 = scanner.nextInt();

    System.out.print("Agora digite um número real: ");
    double num3 = scanner.nextDouble();

    double calculoA = ((double) num1 * 2) * ((double) num2 / 2);
    double calculoB = num1 * 3 + num3;
    double calculoC = Math.pow(num3, 3);

    System.out.println("Cálculo A: " + calculoA);
    System.out.println("Cálculo B: " + calculoB);
    System.out.println("Cálculo C: " + calculoC);

  }

}
