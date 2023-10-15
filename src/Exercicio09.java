import java.util.Scanner;

public class Exercicio09 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a temperatura em º Fahrenheit: ");
    float fahrenheit = scanner.nextFloat();

    double celsius = (fahrenheit - 32) * 5 / 9;

    System.out.printf("A temperatura é %.3fºC", celsius);

  }

}
