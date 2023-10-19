package lista2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Exercicio18 {

  public static void main(String[] args) {
    Scanner scanner =  new Scanner(System.in);

    System.out.print("Digite uma data no formato dd/mm/aaaa: ");
    String data = scanner.next();

    SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
    format.setLenient(false);

    try {
      format.parse(data);
      System.out.println("A data é válida");
    } catch (ParseException e) {
      System.out.println("A data não é válida");
    }
  }

}
