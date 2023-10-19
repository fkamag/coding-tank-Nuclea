package lista2;

import java.util.Scanner;

public class Exercicio11 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o salário: ");
    double salario = scanner.nextDouble();
    double salarioNovo;
    int percentual;
    double valorAumento;

    if (salario <= 280) {
      salarioNovo = salario * 1.2;
      percentual = 20;
      valorAumento = salario * percentual / 100;
    } else if (salario <= 700) {
      salarioNovo = salario * 1.15;
      percentual = 15;
      valorAumento = salario * percentual / 100;
    } else if (salario <= 1500) {
      salarioNovo = salario * 1.1;
      percentual = 10;
      valorAumento = salario * percentual / 100;
    } else {
      salarioNovo = salario * 1.05;
      percentual = 5;
      valorAumento = salario * percentual / 100;
    }

    System.out.printf("Salário antes do reajuste : R$ %8.2f\n", salario);
    System.out.printf("Percentual aplicado\t\t\t\t: \t\t\t%d %%\n", percentual);
    System.out.printf("Valor do aumento\t\t\t\t\t: R$ %8.2f\n", valorAumento);
    System.out.printf("Novo salário após reajuste: R$ %8.2f\n", salarioNovo);
  }

}
