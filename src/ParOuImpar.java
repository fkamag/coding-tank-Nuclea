import java.util.Scanner;

public class ParOuImpar {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número: ");
    int numero = scanner.nextInt();

    int resto = numero % 2;

    boolean ePar = resto == 0;

    if (ePar) {
      System.out.println("Esse número é par");
    } else {
      System.out.println("Esse número é impar");
    }

  }

}
