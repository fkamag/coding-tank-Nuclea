import java.util.Scanner;

public class Exercicio08 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o seu salário por hora: ");
    float salario = scanner.nextFloat();

    System.out.print("Digite a quantidade de horas trabalhadas: ");
    float horas = scanner.nextFloat();

    float valor = salario * horas;

    System.out.printf("O salário bruto é %.2f", valor);
  }

}
