import java.util.Scanner;

public class Media {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite a média: ");
    float media = scanner.nextFloat();

    String conceito;

    if (media >= 9) {
      conceito = "A";
    } else if (media >= 8) {
      conceito = "B";
    } else if (media >= 7) {
      conceito = "C";
    } else {
      conceito = "D";
    }

    System.out.println("O conceito é " + conceito);
  }
}
