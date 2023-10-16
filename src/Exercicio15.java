import java.util.Scanner;

public class Exercicio15 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o seu salário por hora: ");
    float salario = scanner.nextFloat();

    System.out.print("Digite a quantidade de horas trabalhadas: ");
    float horas = scanner.nextFloat();
    float salarioBruto = salario * horas;
    double ir = salarioBruto * 0.11;
    double inss = salarioBruto * 0.08;
    double sindicato = salarioBruto * 0.05;
    double salarioLiquido = salarioBruto - ir - inss - sindicato;

    System.out.printf("+ Salário Bruto  : R$ %.2f %n", salarioBruto);
    System.out.printf("- IR             : R$ %.2f  %n", ir);
    System.out.printf("- INSS           : R$ %.2f %n", inss);
    System.out.printf("- Sindicato      : R$ %.2f %n", sindicato);
    System.out.printf("= Salário Líquido: R$ %.2f %n", salarioLiquido);

  }

}
