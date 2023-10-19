package lista2;

import java.util.Scanner;

public class Exercicio12 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o salário por hora: ");
    float salarioPorHora = scanner.nextFloat();
    System.out.print("Digite a quantidade de horas trabalhadas: ");
    float horas = scanner.nextFloat();
    float salario = salarioPorHora * horas;

    int percentual;

    if (salario <= 900) {
      percentual = 0;
    } else if (salario <= 1500) {
      percentual = 5;
    } else if (salario <= 2500) {
      percentual = 10;
    } else {
      percentual = 20;
    }

    double ir = salario * percentual / 100;
    double inss = salario * 0.08;
    double sindicato = salario * 0.03;
    double fgts = salario * 0.11;
    double descontos = ir + inss + sindicato;
    double salarioLiquido = salario - descontos;

    System.out.printf("+ Salário Bruto (R$ %5.2f * %.0f)\t: R$ %8.2f%n",salarioPorHora, horas, salario);
    System.out.printf("- IR (%d%%)\t\t\t\t\t\t\t\t\t\t\t\t: R$ %8.2f%n", percentual, ir);
    System.out.printf("- INSS (8%%)\t\t\t\t\t\t\t\t\t\t\t\t: R$ %8.2f%n", inss);
    System.out.printf("- Sindicato (3%%)\t\t\t\t\t\t\t\t\t: R$ %8.2f%n", sindicato);
    System.out.printf("  FGTS (11%%)\t\t\t\t\t\t\t\t\t\t\t: R$ %8.2f%n", fgts);
    System.out.printf("  Total de descontos\t\t\t\t\t\t\t: R$ %8.2f%n", descontos);
    System.out.printf("= Salário Líquido\t\t\t\t\t\t\t\t\t: R$ %8.2f%n", salarioLiquido);
  }

}

