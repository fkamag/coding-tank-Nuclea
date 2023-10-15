import java.util.Scanner;

public class Exercicio06 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o raio de um círculo: ");
    float raio = scanner.nextFloat();

    double area = Math.pow(raio, 2) * Math.PI;

    System.out.printf("A área do círculo é %.3f", area);
  }

}
