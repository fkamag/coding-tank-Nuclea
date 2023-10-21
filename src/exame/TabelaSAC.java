package exame;

import java.util.Scanner;

public class TabelaSAC {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Valor do Empréstimo: ");
    double valor = scanner.nextDouble();
    System.out.print("Taxa de juros ao mês: ");
    double taxa = scanner.nextDouble();
    System.out.print("Prazo de Pagamento: ");
    double prazo = scanner.nextDouble();

    double amortizacao = valor / prazo;
    System.out.printf("Valor fixo da amortização R$ %.2f, "
        + "Saldo devedor total R$ %.2f com juros de %.1f%% ao mês.\n", amortizacao, valor, taxa);

    double juros;
    double prestacao;
    double somaPrestacao = 0;
    double somaJuros = 0;
    double somaAmortizacao = 0;

    for (int i = 1; i <= prazo; i++) {
      juros = valor * taxa /100;
      prestacao = amortizacao + juros;
      valor -= amortizacao;
      System.out.printf("Parcela %2d | Juros: R$ %6.2f | "
          + "Prestação: R$ %9.2f | Saldo devedor: R$ %9.2f\n", i, juros, prestacao, valor);
      somaPrestacao += prestacao;
      somaJuros += juros;
      somaAmortizacao += amortizacao;
    }
    System.out.printf("Total: Prestação R$ %.2f, "
        + "Juros R$ %.2f, Amortização R$ %.2f", somaPrestacao, somaJuros, somaAmortizacao);
  }

}
