package lista2;

import java.util.Scanner;

public class Exercicio19 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um valor menor que 1000: ");
    int valorRestante = scanner.nextInt();
    String mensagem = "";
    int centena = 0;
    int dezena = 0;
    int unidade = 0;

    if (valorRestante >= 100) {
      centena = valorRestante / 100;
      valorRestante -= centena * 100;
    }
    if (valorRestante >= 10) {
      dezena = valorRestante /10;
      valorRestante -= dezena * 10;
    }
    if (valorRestante >= 1) {
      unidade = valorRestante;
    }
    if (centena > 0) {
      if (centena > 1) {
        mensagem += centena + " centenas";
      } else {
        mensagem += centena + " centena";
      }
    }
    if (dezena > 0) {
      if (centena > 0) {
        if (unidade > 0) {
          mensagem += ", ";
        } else {
          mensagem += " e ";
        }
      }
      if (dezena > 1) {
        mensagem += dezena + " dezenas";
      } else {
        mensagem += dezena + " dezena";
      }
    }
    if (unidade > 0) {
      if (centena > 0 || dezena > 0) {
        mensagem += " e ";
      }
      if (unidade > 1) {
        mensagem += unidade + " unidades";
      } else {
        mensagem += unidade + " unidade";
      }
    }
    System.out.println(mensagem);
  }

}
