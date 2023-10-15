import java.util.Scanner;

public class Exercicio10 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a temperatura em º Celsius: ");
    float celsius = scanner.nextFloat();

    double fahrenheit = (celsius * 9 / 5) + 32;

    System.out.printf("A temperatura é %.3fºF", fahrenheit);
  }

}
