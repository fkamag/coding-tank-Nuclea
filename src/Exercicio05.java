import java.util.Scanner;

public class Exercicio05 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Informe o valor em metros: ");
    float num = scanner.nextFloat();

    float calculo = num * 100;

    System.out.println("O valor em centímetros é " + calculo);
  }

}
