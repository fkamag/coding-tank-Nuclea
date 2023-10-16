import java.util.Scanner;

public class Exercicio17 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite a quantidade de m² que precisa pintar: ");
    double area = scanner.nextInt();
    area *= 1.1;

    int qtdeLatas = 0;
    float valorTotal1;
    do {
      qtdeLatas ++;
    } while (qtdeLatas * 108 < area);
    valorTotal1 = qtdeLatas * 80;
    System.out.printf("A quantidade para atender a área é de %d latas de 18L "
        + "e o valor total é de R$ %.2f. %n", qtdeLatas, valorTotal1);

    int qtdeGalao = 0;
    float valorTotal2;
    do {
      qtdeGalao ++;
    } while (qtdeGalao * 21.6 < area);
    valorTotal2 = qtdeGalao * 25;
    System.out.printf("A quantidade para atender a área é de %d galões de 3.6L "
        + "e o valor total é de R$ %.2f. %n", qtdeGalao, valorTotal2);

    float valorParcial;
    int qtdeLatasParcial = 0;
    int qtdeGalaoParcial = 0;
    double areaCobertura;
    do {
      qtdeLatasParcial ++;
      areaCobertura = qtdeLatasParcial * 108 + qtdeGalaoParcial * 21.6;
      if (area < areaCobertura) {
        qtdeLatasParcial --;
        qtdeGalaoParcial ++;
        areaCobertura = qtdeLatasParcial * 108 + qtdeGalaoParcial * 21.6;
      }
    } while (areaCobertura < area);
    valorParcial = qtdeLatasParcial * 80 + qtdeGalaoParcial * 25;

    if (valorParcial < valorTotal1) {
      System.out.printf("A melhor opção é %d latas e %d galões "
          + "e o valor total é de R$ %.2f", qtdeLatasParcial, qtdeGalaoParcial, valorParcial);
    } else {
      System.out.printf("A melhor opção é %d latas de 18L "
          + "e o valor total é de R$ %.2f", qtdeLatas, valorTotal1);
    }

  }

}
