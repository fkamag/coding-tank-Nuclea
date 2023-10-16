import java.util.Scanner;

public class Exercicio12 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a sua altura em cm: ");
    int altura = scanner.nextInt();

    float alturaMt = (float) altura / 100;

    double pesoIdeal = alturaMt * 72.7 -58;

    System.out.printf("O seu peso ideal é %.1f", pesoIdeal);

  }

}
